package L15_Command;

public class EngineStartCommand implements Command {

    private final StandardEngineStartStopProcedures engineProcedures;

    public EngineStartCommand(StandardEngineStartStopProcedures engineProcedures) {
        this.engineProcedures = engineProcedures;
    }

    @Override
    public boolean execute() {
        engineProcedures.turnOnBatteryPower();
        engineProcedures.startAPU();
        engineProcedures.airSupplyOn();
        engineProcedures.hydraulicSystemOn();
        engineProcedures.fuelSupplyOn();
        engineProcedures.plugOnGenerator();
        return engineProcedures.isEngineStarted();
    }
}
