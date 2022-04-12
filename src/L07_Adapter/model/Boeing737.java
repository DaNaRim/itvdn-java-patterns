package L07_Adapter.model;

public class Boeing737 extends Aircraft {

    @Override
    public void startEngines() {
        System.out.println("Starting left engine");
        System.out.println("...");
        System.out.println("Left engine has been started");
        System.out.println("Starting right engine");
        System.out.println("...");
        System.out.println("Right engine has been started");
        System.out.println();
        isEnginesStarted = true;
    }

    @Override
    public void stopEngines() {
        System.out.println("Stopping left and right engines");
        System.out.println("...");
        System.out.println("Engines have been stopped");
        System.out.println();
        isEnginesStarted = false;
    }

    @Override
    public void taxiToRunway() {
        System.out.println("Creating taxi route");
        System.out.println("...");
        System.out.println("Taxing to the Runway");
        System.out.println("...");
        System.out.println("On the Runway. Ready for take off");
        System.out.println();
        isOnRunway = true;
    }

    @Override
    public void takeOff() {
        System.out.println("Accelerating...");
        System.out.println("V1");
        System.out.println("V2");
        System.out.println("Take off");
        System.out.println();
    }

}
