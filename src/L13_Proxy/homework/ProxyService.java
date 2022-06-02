package L13_Proxy.homework;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProxyService implements Service {

    private static final Service service = new ServiceImpl();


    @Override
    public void printCarsDetails(List<Car> cars) {
        List<Car> sorted = cars.stream()
                .sorted(Comparator.comparing(Car::isStolen).reversed())
                .collect(Collectors.toList());

        service.printCarsDetails(sorted);
    }
}
