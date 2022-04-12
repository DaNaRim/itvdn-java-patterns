package L08_Bridge.fuelStation.fillingDispensers;

import L08_Bridge.fuelStation.cars.Vehicle;
import L08_Bridge.fuelStation.fillingDispensers.interfaces.iFillingDispenser;
import L08_Bridge.fuelStation.fuels.Diesel;
import L08_Bridge.fuelStation.fuels.Petrol;

public class StandardDispenser extends iFillingDispenser {

    @Override
    protected boolean isCorrectVehicle(Vehicle vehicle) {
        return true;
    }

    @Override
    public void refuel(String fuelName, Vehicle vehicle) {
        if (fuelName.equals("Petrol")) {
            fuel = new Petrol();
            System.out.println(vehicle + " is refueling by " + fuel.fuelType());
        } else if (fuelName.equals("Diesel")) {
            fuel = new Diesel();
            System.out.println(vehicle + " is refueling by " + fuel.fuelType());
        } else {
            System.out.println("Choose correct type of fuel");
        }
    }
}
