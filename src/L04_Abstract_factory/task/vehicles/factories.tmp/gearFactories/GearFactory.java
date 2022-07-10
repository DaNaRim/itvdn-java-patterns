package L04_Abstract_factory.task.vehicles.factories.tmp.gearFactories;

import L04_Abstract_factory.task.vehicles.wheels.abstractions.Gear;

public interface GearFactory {

    Gear createWheelGear();

    Gear createCatGear();
}
