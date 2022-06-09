package L15_Command;

public class EngineStopCommand implements Command {

    private final StandardEngineStartStopProcedures engineProcedures;

    public EngineStopCommand(StandardEngineStartStopProcedures engineProcedures) {
        this.engineProcedures = engineProcedures;
    }

    @Override
    public boolean execute() {
        engineProcedures.plugOutGenerator();
        engineProcedures.fuelSupplyOff();
        engineProcedures.hydraulicSystemOff();
        engineProcedures.airSupplyOff();
        engineProcedures.stopAPU();
        engineProcedures.turnOffBatteryPower();
        return engineProcedures.isEngineStarted();
    }
}
