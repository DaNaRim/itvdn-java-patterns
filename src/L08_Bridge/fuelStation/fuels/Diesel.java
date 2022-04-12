package L08_Bridge.fuelStation.fuels;

import L08_Bridge.fuelStation.fuels.interfaces.iFuel;

public class Diesel implements iFuel {

    @Override
    public String fuelType() {
        return "Diesel";
    }
}
