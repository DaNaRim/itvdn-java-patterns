package L11_Facade;

public class RoomMovementDetector implements MovementDetector {

    private boolean turnedOn;
    private int sensitivity;

    public RoomMovementDetector() {
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
        System.out.println("Room movement detector has been activated!");
    }

    @Override
    public void off() {
        turnedOn = false;
        System.out.println("Room movement detector has been deactivated!");
    }

    @Override
    public void adjustSensitivity(int sensitivity) {
        this.sensitivity = sensitivity;
        System.out.println("Sensitivity of room movement detector was adjusted to: " + sensitivity);
    }
}
