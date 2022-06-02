package L11_Facade;

public class HallMovementDetector implements MovementDetector {

    private boolean turnedOn;
    private int sensitivity;

    public HallMovementDetector() {
        this.sensitivity = MovementDetector.sensitivity;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public int getSensitivity() {
        return sensitivity;
    }

    @Override
    public void on() {
        turnedOn = true;
        System.out.println("Hall movement detector has been activated!");
    }

    @Override
    public void off() {
        turnedOn = false;
        System.out.println("Hall movement detector has been deactivated!");
    }

    @Override
    public void adjustSensitivity(int sensitivity) {
        this.sensitivity = sensitivity;
        System.out.println("Sensitivity was adjusted to: " + sensitivity);
    }
}
