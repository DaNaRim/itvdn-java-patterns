package L08_Bridge.fuelStation.fillingDispensers.interfaces;

import L08_Bridge.fuelStation.cars.Vehicle;
import L08_Bridge.fuelStation.fuels.interfaces.iFuel;

public abstract class iFillingDispenser {

    protected iFuel fuel;

    protected abstract boolean isCorrectVehicle(Vehicle vehicle);

    public abstract void refuel(String fuel, Vehicle vehicle);
}
