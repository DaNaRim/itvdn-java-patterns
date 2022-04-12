package L07_Adapter;

import L07_Adapter.model.Aircraft;
import L07_Adapter.model.SimpleDevice;

public class IronAdapter implements SimpleDevice {

    Aircraft aircraft;

    public IronAdapter(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public void turnOn() {
        System.out.println("///---method turnOn---///");
        aircraft.startEngines();
    }

    @Override
    public void turnOff() {
        aircraft.stopEngines();
    }

    @Override
    public void warmUp() {
//        if (aircraft.isEnginesStarted) {
//            System.out.println("///---Engines were started before---///");
//            if (aircraft.isOnRunway) {
//                System.out.println("///---Aircraft was on the RW before---///");
//            } else {
//                aircraft.taxiToRunway();
//            }
//        } else {
//            aircraft.startEngines();
//            aircraft.taxiToRunway();
//        }
//        aircraft.takeOff();

        if (aircraft.isEnginesStarted) {
            System.out.println("///---Engines were started before---///");
        } else {
            aircraft.startEngines();
        }
        if (aircraft.isOnRunway) {
            System.out.println("///---Aircraft was on the RW before---///");
        } else {
            aircraft.taxiToRunway();
        }
        aircraft.takeOff();
    }
}
