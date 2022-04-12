package L08_Bridge.fuelStation.fillingDispensers;

import L08_Bridge.fuelStation.cars.Vehicle;
import L08_Bridge.fuelStation.fillingDispensers.interfaces.iFillingDispenser;
import L08_Bridge.fuelStation.fuels.Diesel;

public class TruckDispenser extends iFillingDispenser {

    @Override
    protected boolean isCorrectVehicle(Vehicle vehicle) {
        return vehicle.equals(Vehicle.TRUCK) || vehicle.equals(Vehicle.BUS);
    }

    @Override
    public void refuel(String fuelName, Vehicle vehicle) {
        if (!fuelName.equals("Diesel")) {
            System.out.println("This dispenser contains only Diesel");
            return;
        }
        if (!isCorrectVehicle(vehicle)) {
            System.out.println("Please, change the filling dispenser to correct type");
            return;
        }
        fuel = new Diesel();
        System.out.println(vehicle + " is refueling by " + fuel.fuelType());
    }
}
