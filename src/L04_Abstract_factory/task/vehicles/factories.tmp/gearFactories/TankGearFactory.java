package L04_Abstract_factory.task.vehicles.factories.tmp.gearFactories;

import L04_Abstract_factory.task.vehicles.wheels.TankCaterpillar;
import L04_Abstract_factory.task.vehicles.wheels.abstractions.Gear;

public class TankGearFactory implements GearFactory {

    //I think it`s bad example

    @Override
    public Gear createWheelGear() {
        return null;
    }

    @Override
    public Gear createCatGear() {
        return new TankCaterpillar();
    }
}
