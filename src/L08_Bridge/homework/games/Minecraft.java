package L08_Bridge.homework.games;

public class Minecraft extends Game {

    @Override
    public void start() {
        System.out.println("Starting minecraft...");
    }

    @Override
    public void exit() {
        System.out.println("Finishing minecraft...");
    }
}
