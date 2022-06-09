package L15_Command;

public class Main {

    private static final BlackBox blackBox = new BlackBox();
    private static final StandardEngineStartStopProcedures procedures = new StandardEngineStartStopProcedures();
    private static final EngineStartCommand startCommand = new EngineStartCommand(procedures);
    private static final EngineStopCommand stopCommand = new EngineStopCommand(procedures);
    private static final EngineController controller = new EngineController(startCommand, stopCommand, blackBox);

    public static void main(String[] args) {

//        StandardEngineStartStopProcedures procedures = new StandardEngineStartStopProcedures();
//
//        procedures.turnOnBatteryPower();
//        procedures.startAPU();
//        procedures.airSupplyOn();
//        procedures.hydraulicSystemOn();
//        procedures.fuelSupplyOn();
//
//        System.out.println(procedures.isEngineStarted());
//
//        procedures.plugOnGenerator();

        System.out.println();
        blackBox.printStack();

        System.out.println();
        controller.startEngine();
        System.out.println();
        blackBox.printStack();

        System.out.println();
        controller.stopEngine();
        System.out.println();
        blackBox.printStack();
    }
}
