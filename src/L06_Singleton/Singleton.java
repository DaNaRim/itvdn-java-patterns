package L06_Singleton;

import java.io.Serial;
import java.io.Serializable;

public class Singleton implements Serializable {

    private static volatile Singleton instance;
    private int num = 4;

    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) synchronized (Singleton.class) {
            instance = new Singleton();
        }
        return instance;
    }

    @Serial
    protected Object readResolve() {
        return instance;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
