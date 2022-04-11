package L06_Singleton.multitone;

import java.util.HashMap;

public class Multiton {

    private static final HashMap<Level, Multiton> instances = new HashMap<>();
    private static int count = 0;

    private Multiton() {
        count++;
        System.out.println("instances created: " + count);
    }

    public static Multiton get(Level level) {
        if (instances.containsKey(level)) {
            return instances.get(level);
        }

        synchronized (Multiton.class) {
            Multiton instance = new Multiton();
            instances.put(level, instance);
            return instance;
        }
    }

    public static int getCount() {
        return count;
    }

}
