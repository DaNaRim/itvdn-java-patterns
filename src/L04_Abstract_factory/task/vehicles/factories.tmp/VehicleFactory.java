package L04_Abstract_factory.task.vehicles.factories.tmp;

import L04_Abstract_factory.task.vehicles.Vehicle;
import L04_Abstract_factory.task.vehicles.wheels.GearType;

public interface VehicleFactory {

    Vehicle createVehicle(GearType gearType);
}
