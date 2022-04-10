package L04_Prototype.task;

import L04_Prototype.task.train.astractions.CarriageModule;
import L04_Prototype.task.train.astractions.RailwayCarriage;
import L04_Prototype.task.train.carriages.LuxSleepingCarriage;
import L04_Prototype.task.train.modules.LuxSleepingModule;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("!!!Prototype pattern!!!\n");

        /*RailwayCarriage carriage = new SittingCarriage(2);
        System.out.println(carriage + "\n");
        System.out.print("Compare modules references: ");
        System.out.println(carriage.getModuleArray()[0] == carriage.getModuleArray()[1]);
        System.out.print("Compare modules equality: ");
        System.out.println(carriage.getModuleArray()[0].equals(carriage.getModuleArray()[1]) + "\n");

        RailwayCarriage copyOfCarriage = carriage.getClone();
        System.out.print("Compare carriage references: ");
        System.out.println(carriage == copyOfCarriage);
        System.out.print("Compare carriage equality: ");
        System.out.println(carriage.equals(copyOfCarriage) + "\n");

        System.out.println("------------------------------------------------------------------------------------------------------\n");*/

/*        RailwayCarriage sleepingCarriage = new SleepingCarriage();
        System.out.println(sleepingCarriage);
        System.out.println(((SleepingCarriage) sleepingCarriage).clone() + "\n");

        System.out.print("Compare carriage references: ");
        System.out.println(sleepingCarriage == ((SleepingCarriage) sleepingCarriage).clone());
        System.out.print("Compare carriage equality: ");
        System.out.println(sleepingCarriage.equals(((SleepingCarriage) sleepingCarriage).clone()) + "\n");

        System.out.print("Compare modules references: ");
        System.out.println(sleepingCarriage.getModuleArray()[0] == sleepingCarriage.getModuleArray()[1]);
        System.out.print("Compare modules equality: ");
        System.out.println(sleepingCarriage.getModuleArray()[0].equals(sleepingCarriage.getModuleArray()[1]) + "\n");

        System.out.println("------------------------------------------------------------------------------------------------------\n");*/

        RailwayCarriage luxSleepingCarriage = new LuxSleepingCarriage();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

        objectOutputStream.writeObject(luxSleepingCarriage);
        objectOutputStream.close();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        RailwayCarriage cloneLuxSleepingCarriage = (LuxSleepingCarriage)objectInputStream.readObject();


        ByteArrayOutputStream byteArrayOutputStreamModule = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStreamModule = new ObjectOutputStream(byteArrayOutputStreamModule);

        for(int i = 0; i < luxSleepingCarriage.getModuleArray().length; i++) {
            objectOutputStreamModule.writeObject(luxSleepingCarriage.getModuleArray()[i]);
        }

        objectOutputStreamModule.close();

        ByteArrayInputStream byteArrayInputStreamModule = new ByteArrayInputStream(byteArrayOutputStreamModule.toByteArray());
        ObjectInputStream objectInputStreamModule = new ObjectInputStream(byteArrayInputStreamModule);

        for(int j = 0; j < luxSleepingCarriage.getModuleArray().length; j++) {
            CarriageModule module = (LuxSleepingModule)objectInputStreamModule.readObject();
            cloneLuxSleepingCarriage.getModuleArray()[j] = module;
        }

        System.out.println(luxSleepingCarriage);
        System.out.println(cloneLuxSleepingCarriage + "\n");
        System.out.print("Compare modules references: ");
        System.out.println(luxSleepingCarriage == cloneLuxSleepingCarriage);
        System.out.print("Compare carriage equality: ");
        System.out.println(luxSleepingCarriage.equals(cloneLuxSleepingCarriage) + "\n");

        System.out.print("Compare modules references: ");
        System.out.println(luxSleepingCarriage.getModuleArray()[0] == cloneLuxSleepingCarriage.getModuleArray()[1]);
        System.out.print("Compare modules equality: ");
        System.out.println(luxSleepingCarriage.getModuleArray()[0].equals(cloneLuxSleepingCarriage.getModuleArray()[1]));

    }
}
