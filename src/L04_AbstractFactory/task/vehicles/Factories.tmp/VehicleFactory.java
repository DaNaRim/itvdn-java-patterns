package L04_AbstractFactory.task.vehicles.factories.tmp;

import L04_AbstractFactory.task.vehicles.Vehicle;
import L04_AbstractFactory.task.vehicles.wheels.GearType;

public interface VehicleFactory {

    Vehicle createVehicle(GearType gearType);
}
