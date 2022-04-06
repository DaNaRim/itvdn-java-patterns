package L04_AbstractFactory.task.vehicles.factories.tmp.gearFactories;

import L04_AbstractFactory.task.vehicles.wheels.abstractions.Gear;

public interface GearFactory {

    Gear createWheelGear();

    Gear createCatGear();
}
