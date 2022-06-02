package L11_Facade;

public class DoorLock implements Lock {

    private boolean isLocked;

    @Override
    public void on() {
        isLocked = true;
        System.out.println("Door is locked.");
    }

    @Override
    public void off() {
        isLocked = false;
        System.out.println("Door is unlocked");
    }

    @Override
    public boolean getStatus() {
        return isLocked;
    }
}
