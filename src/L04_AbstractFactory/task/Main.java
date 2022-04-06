package L04_AbstractFactory.task;

import L04_AbstractFactory.task.vehicles.Tank;
import L04_AbstractFactory.task.vehicles.factories.TankFactory;
import L04_AbstractFactory.task.vehicles.factories.tmp.TractorFactory;
import L04_AbstractFactory.task.vehicles.factories.tmp.VehicleFactory;
import L04_AbstractFactory.task.vehicles.wheels.GearType;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vehicle Plant");

        VehicleFactory tankFactory = new TankFactory();
        VehicleFactory tractorFactory = new TractorFactory();

        //Tank catTank = (Tank) tankFactory.createVehicle(GearType.CATERPILLAR);
        Tank wheelTank = (Tank) tankFactory.createVehicle(GearType.WHEEL);
/*        Tractor wheelTractor = (Tractor) tractorFactory.createVehicle(GearType.WHEEL);
        Tractor catTractor = (Tractor) tractorFactory.createVehicle(GearType.CATERPILLAR);*/

        //System.out.println(catTank);
        System.out.println(wheelTank);
/*        System.out.println(catTractor);
        System.out.println(wheelTractor);*/
    }
}
