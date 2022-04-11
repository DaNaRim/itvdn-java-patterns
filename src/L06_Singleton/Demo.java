package L06_Singleton;

import java.io.*;

public class Demo {


    public static void main(String[] args) throws Exception {
//        testSingleton();
//        testMultithreadedSingleton();
        testEnum();
    }

    static void testSingleton() throws Exception {
        Singleton singleton = Singleton.getInstance();
        singleton.setNum(22);

        /*Singleton singleton2 = Singleton.getInstance();
        singleton.setValue(19);*/
        saveToFile(singleton);

        singleton.setNum(19);

        Singleton singleton2 = readFromFile();

        System.out.println(singleton.getNum());
        System.out.println(singleton2.getNum());
        System.out.println(singleton == singleton2);
    }

    static void testMultithreadedSingleton() {
        new Thread(() -> {
            Singleton instance1 = Singleton.getInstance();
            System.out.println("Instance 1 hash:" + instance1.hashCode());
        }).start();

        new Thread(() -> {
            Singleton instance2 = Singleton.getInstance();
            System.out.println("Instance 2 hash:" + instance2.hashCode());
        }).start();
    }

    static void testEnum() throws IOException, ClassNotFoundException {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.setValue(45);

//        saveToFile
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/L06_Singleton/sngltn.bin"))) {
            out.writeObject(singleton);
        }

        EnumSingleton singleton2;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/L06_Singleton/sngltn.bin"))) {
            singleton2 = (EnumSingleton) in.readObject();
        }

        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());
        System.out.println(singleton == singleton2);
    }

    static void saveToFile(Singleton singleton) throws Exception {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/L06_Singleton/sngltn.bin"))) {
            out.writeObject(singleton);
        }
    }

    static Singleton readFromFile() throws Exception {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/L06_Singleton/sngltn.bin"))) {
            return (Singleton) in.readObject();
        }
    }
}
