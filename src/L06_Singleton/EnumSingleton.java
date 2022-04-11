package L06_Singleton;

public enum EnumSingleton {

    INSTANCE;

    int value;

    EnumSingleton() {
        value = 14;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
