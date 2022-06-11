package L11_Facade;

public interface MovementDetector {

    int SENSITIVITY = 40;

    void on();

    void off();

    void adjustSensitivity(int sensitivity);
}
