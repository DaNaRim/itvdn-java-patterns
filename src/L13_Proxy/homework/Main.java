package L13_Proxy.homework;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver(1L, "Adam", "Bear");

        List<Car> cars = Arrays.asList(
                new Car(1L, "ASD", "Red", "1234", driver, false),
                new Car(2L, "ASB", "Red", "1237", driver, true),
                new Car(3L, "ADD", "Red", "9867", driver, true),
                new Car(4L, "ADDD", "Red", "1236", driver, false)
        );

        Service service = new ServiceImpl();
        Service proxyService = new ProxyService();

//        service.printCarsDetails(cars);
        proxyService.printCarsDetails(cars);

    }

}
