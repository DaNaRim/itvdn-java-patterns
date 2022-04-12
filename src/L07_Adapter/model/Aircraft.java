package L07_Adapter.model;

public abstract class Aircraft {
    public boolean isEnginesStarted = false;
    public boolean isOnRunway = false;

    public abstract void startEngines();
    public abstract void stopEngines();
    public abstract void taxiToRunway();
    public abstract void takeOff();
}
