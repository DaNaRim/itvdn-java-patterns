package L11_Facade;

public class KitchenMovementDetector implements MovementDetector {

    private boolean turnedOn;
    private int sensitivity;

    public KitchenMovementDetector() {
        this.sensitivity = MovementDetector.SENSITIVITY;
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
        System.out.println("Kitchen movement detector has been activated!");
    }

    @Override
    public void off() {
        turnedOn = false;
        System.out.println("Kitchen movement detector has been deactivated!");
    }

    @Override
    public void adjustSensitivity(int sensitivity) {
        this.sensitivity = sensitivity;
        System.out.println("Sensitivity of the kitchen movement detector was adjusted to: " + sensitivity);
    }
}
