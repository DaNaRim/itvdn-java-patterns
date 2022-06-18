package L18_Mediator.smartHouseController.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@SuppressWarnings("Duplicates")
public class WebService {

    private static final String TARGET_URL =
            "https://weather.com/ru-RU/weather/today/l/96f2f84af9a5f5d452eb0574d4e4d8a840c71b05e22264ebdc0056433a642c84";

    private final HttpURLConnection connection;

    public WebService() throws IOException {
        URL url = new URL(TARGET_URL);
        this.connection = (HttpURLConnection) url.openConnection();
        this.connection.setRequestMethod("GET");
        this.connection.setDoOutput(true);
    }

    public int getForecastDaytimeTemperature() throws IOException {
        String temperatureData = getTemperatureData();
        return Integer.parseInt(temperatureData.substring(temperatureData.indexOf(">") + 1, temperatureData.indexOf("°")));
    }

    public int getForecastNighttimeTemperature() throws IOException {
        String temperatureData = getTemperatureData();
        String subMinTempString =
                temperatureData.substring(temperatureData.indexOf("/<span data-testid=\"TemperatureValue\">"));
        return Integer.parseInt(
                subMinTempString.substring(subMinTempString.indexOf(">") + 1, subMinTempString.indexOf("°")));
    }

    private String getTemperatureData() throws IOException {
        String temperatureData;
        try (InputStream is = connection.getInputStream();
             BufferedReader rd = new BufferedReader(new InputStreamReader(is))) {

            StringBuilder response = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                if (line.contains("<div data-testid=\"wxData\" class=\"WeatherDetailsListItem--wxData--2bzvn\">"
                        + "<span data-testid=\"TemperatureValue\">")) {
                    String temperature = line.substring(line.indexOf("<span data-testid=\"TemperatureValue\">",
                            line.indexOf("°</span>")));
                    response.append(temperature);
                    response.append('\r');
                }
            }
            temperatureData = response.toString();
        }
        return temperatureData;
    }
}
