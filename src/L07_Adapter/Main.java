package L07_Adapter;

import L07_Adapter.model.Aircraft;
import L07_Adapter.model.Boeing737;
import L07_Adapter.model.SimpleDevice;

public class Main {

    public static void main(String[] args) {
        /*SimpleDevice iron = new Iron();
        iron.turnOn();
        iron.warmUp();
        iron.turnOff();*/
        Aircraft aircraft = new Boeing737();

        SimpleDevice ironAdapter = new IronAdapter(aircraft);

        ironAdapter.turnOn();
        //ironAdapter.turnOff();
        ironAdapter.warmUp();
    }
}
