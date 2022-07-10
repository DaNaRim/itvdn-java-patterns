package L04_Abstract_factory.task.vehicles.factories;

import L04_Abstract_factory.task.exceptions.VehicleConstructException;
import L04_Abstract_factory.task.vehicles.Tank;
import L04_Abstract_factory.task.vehicles.Vehicle;
import L04_Abstract_factory.task.vehicles.factories.tmp.VehicleFactory;
import L04_Abstract_factory.task.vehicles.factories.tmp.gearFactories.GearFactory;
import L04_Abstract_factory.task.vehicles.factories.tmp.gearFactories.TankGearFactory;
import L04_Abstract_factory.task.vehicles.wheels.GearType;
import L04_Abstract_factory.task.vehicles.wheels.abstractions.Gear;

public class TankFactory implements VehicleFactory {

    private static final GearFactory gearFactory = new TankGearFactory();

    @Override
    public Vehicle createVehicle(GearType gearType) {
        Tank tank = new Tank();
        Gear gear = switch (gearType) {
            case CATERPILLAR -> gearFactory.createCatGear();
            case WHEEL -> gearFactory.createWheelGear();
        };
        if (gear == null) {
            throw new VehicleConstructException("Can not construct tank with this kind of gears!");
        }
        tank.setGear(gear);
        return tank;
    }
}
