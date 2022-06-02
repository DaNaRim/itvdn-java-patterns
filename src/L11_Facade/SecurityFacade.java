package L11_Facade;

public class SecurityFacade {

    private static final DoorLock doorLock = new DoorLock();
    private static final WindowLock windowLock = new WindowLock();
    private static final HallMovementDetector hallMovementDetector = new HallMovementDetector();
    private static final KitchenMovementDetector kitchenMovementDetector = new KitchenMovementDetector();
    private static final RoomMovementDetector roomMovementDetector = new RoomMovementDetector();

    void allOn() {
        doorLock.on();
        windowLock.on();
        hallMovementDetector.on();
        kitchenMovementDetector.on();
        roomMovementDetector.on();
    }

    void allOff() {
        doorLock.off();
        windowLock.off();
        hallMovementDetector.off();
        kitchenMovementDetector.off();
        roomMovementDetector.off();
    }

    void getStatus() {
        System.out.println("Is Door locked: " + doorLock.getStatus());
        System.out.println("Is Window locked: " + windowLock.getStatus());
        System.out.println("Is Hall secured: " + hallMovementDetector.isTurnedOn());
        System.out.println("Sensitivity of Hall detector: " + hallMovementDetector.getSensitivity());
        System.out.println("Is Kitchen locked: " + kitchenMovementDetector.isTurnedOn());
        System.out.println("Sensitivity of Kitchen detector: " + kitchenMovementDetector.getSensitivity());
        System.out.println("Is Room locked: " + roomMovementDetector.isTurnedOn());
        System.out.println("Sensitivity of Room detector: " + roomMovementDetector.getSensitivity());
    }
}
