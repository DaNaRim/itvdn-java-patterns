package L04_AbstractFactory.task.vehicles;

import L04_AbstractFactory.task.vehicles.wheels.abstractions.Gear;

public class Tank implements Vehicle {

    private Gear gear;

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "gear=" + gear +
                '}';
    }
}