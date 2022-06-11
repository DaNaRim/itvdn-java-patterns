package L07_Adapter.model;

public class Iron implements SimpleDevice {

    @Override
    public void turnOn() {
        System.out.println("Iron is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Iron is turning off");
    }

    @Override
    public void warmUp() {
        System.out.println("Iron is warming up");
    }
}
