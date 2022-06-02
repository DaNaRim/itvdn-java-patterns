package L13_Proxy.homework;

import java.util.List;

public class ServiceImpl implements Service {

    @Override
    public void printCarsDetails(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
        System.out.println();
    }
}
