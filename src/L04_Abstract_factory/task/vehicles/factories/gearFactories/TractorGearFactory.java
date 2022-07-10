package L04_Abstract_factory.task.vehicles.factories.gearFactories;

import L04_Abstract_factory.task.vehicles.factories.tmp.gearFactories.GearFactory;
import L04_Abstract_factory.task.vehicles.wheels.TractorCaterpillar;
import L04_Abstract_factory.task.vehicles.wheels.TractorWheel;
import L04_Abstract_factory.task.vehicles.wheels.abstractions.Gear;

public class TractorGearFactory implements GearFactory {

    @Override
    public Gear createWheelGear() {
        return new TractorWheel();
    }

    @Override
    public Gear createCatGear() {
        return new TractorCaterpillar();
    }
}
