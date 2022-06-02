package L11_Facade;

public class WindowLock implements Lock {

    private boolean isLocked;

    @Override
    public void on() {
        isLocked = true;
        System.out.println("Window lock is locked");
    }

    @Override
    public void off() {
        isLocked = false;
        System.out.println("Window lock is unlocked");
    }

    @Override
    public boolean getStatus() {
        return isLocked;
    }
}
