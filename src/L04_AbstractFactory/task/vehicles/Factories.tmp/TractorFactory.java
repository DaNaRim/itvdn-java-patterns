package L04_AbstractFactory.task.vehicles.factories.tmp;

import L04_AbstractFactory.task.vehicles.Tractor;
import L04_AbstractFactory.task.vehicles.Vehicle;
import L04_AbstractFactory.task.vehicles.factories.gearFactories.TractorGearFactory;
import L04_AbstractFactory.task.vehicles.factories.tmp.gearFactories.GearFactory;
import L04_AbstractFactory.task.vehicles.wheels.GearType;
import L04_AbstractFactory.task.vehicles.wheels.abstractions.Gear;

public class TractorFactory implements VehicleFactory {

    private static final GearFactory gearFactory = new TractorGearFactory();

    @Override
    public Vehicle createVehicle(GearType gearType) {
        Tractor tractor = new Tractor();
        Gear gear = switch (gearType) {
            case CATERPILLAR -> gearFactory.createCatGear();
            case WHEEL -> gearFactory.createWheelGear();
        };
        tractor.setGear(gear);
        return tractor;
    }
}
