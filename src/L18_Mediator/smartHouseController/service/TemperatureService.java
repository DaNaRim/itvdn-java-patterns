package L18_Mediator.smartHouseController.service;

import L18_Mediator.smartHouseController.model.Status;

import java.io.IOException;
import java.time.LocalTime;

public class TemperatureService {

    private WebService webService;

    public TemperatureService() {
        try {
            this.webService = new WebService();
        } catch (IOException ex) {
            System.out.println("Unable to get web service.");
        }
    }

    private boolean isNight() {
        LocalTime localTime = LocalTime.now();
        return localTime.getHour() > 22 || localTime.getHour() < 7;
    }

    public Status getOutsideTemperatureStatus() {
        int temperature;
        Status currentStatus = Status.COLD;
        try {
            if (isNight()) {
                temperature = webService.getForecastNighttimeTemperature();
                if (temperature > 26) {
                    currentStatus = Status.BURN_BABY_BURN;
                } else if (temperature > 22) {
                    currentStatus = Status.HOT;
                } else if (temperature > 18) {
                    currentStatus = Status.COMFORT;
                } else if (temperature > 15) {
                    currentStatus = Status.WARM;
                } else {
                    currentStatus = Status.COLD;
                }
            } else {
                temperature = webService.getForecastDaytimeTemperature();
                if (temperature > 28) {
                    currentStatus = Status.BURN_BABY_BURN;
                } else if (temperature > 24) {
                    currentStatus = Status.HOT;
                } else if (temperature > 20) {
                    currentStatus = Status.COMFORT;
                } else if (temperature > 17) {
                    currentStatus = Status.WARM;
                } else {
                    currentStatus = Status.COLD;
                }
            }
        } catch (IOException ex) {
            System.out.println("Unable to start system. No connection to the internet");
        }
        return currentStatus;
    }
}
