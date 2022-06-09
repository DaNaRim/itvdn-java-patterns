package L15_Command;

public class EngineController {

    private final EngineStartCommand startCommand;
    private final EngineStopCommand stopCommand;
    private final BlackBox blackBox;

    public EngineController(EngineStartCommand startCommand,
                            EngineStopCommand stopCommand,
                            BlackBox blackBox) {
        this.startCommand = startCommand;
        this.stopCommand = stopCommand;
        this.blackBox = blackBox;
    }

    public void startEngine() {
        if (startCommand.execute()) blackBox.push(startCommand);
    }

    public void stopEngine() {
        if (!stopCommand.execute()) blackBox.push(stopCommand);
    }
}
