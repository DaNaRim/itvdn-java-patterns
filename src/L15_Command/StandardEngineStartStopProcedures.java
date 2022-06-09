package L15_Command;

public class StandardEngineStartStopProcedures {

    private boolean isBatteryPlugged = false;
    private boolean isAPUActive = false;
    private boolean isAirSupplying = false;
    private boolean isHydraulicSystemOn = false;
    private boolean isFuelSupplying = false;
    private boolean isEngineStarted = false;
    private boolean isGeneratorPlugged = false;

    public void turnOnBatteryPower() {
        if (!isBatteryPlugged) isBatteryPlugged = true;
        System.out.println("Systems is supplying with power from battery");
    }

    public void turnOffBatteryPower() {
        isBatteryPlugged = false;
        System.out.println("Supplying systems with power from battery is cut off");
    }

    public void startAPU() {
        if (!isBatteryPlugged) {
            System.out.println("No power from battery. Roll back and try again");
            return;
        }
        isAPUActive = true;
        System.out.println("APU is started. Aircraft is supplying with power from APU");
    }

    public void stopAPU() {
        isAPUActive = false;
        System.out.println("APU is STOPPED. Supplying aircraft with power from APU is cut off");
    }

    public void airSupplyOn() {
        if (!isAPUActive) {
            System.out.println("APU is not active. Roll back and try again");
            return;
        }
        isAirSupplying = true;
        System.out.println("Engine is supplying with air");
    }

    public void airSupplyOff() {
        isAirSupplying = false;
        System.out.println("Supplying engine with air is cut off");
    }

    public void hydraulicSystemOn() {
        if (!isAPUActive) {
            System.out.println("APU is not active. Roll back and try again");
            return;
        }
        if (!isAirSupplying) {
            System.out.println("No air pressure. Roll back and try again");
            return;
        }
        isHydraulicSystemOn = true;
        System.out.println("Hydraulic system ON");
    }

    public void hydraulicSystemOff() {
        isHydraulicSystemOn = false;
        System.out.println("Hydraulic system OFF");
    }

    public void fuelSupplyOn() {
        if (!isHydraulicSystemOn) {
            System.out.println("Hydraulic system is not active");
            return;
        }
        if (!isAPUActive) {
            System.out.println("APU is not active. Roll back and try again");
            return;
        }
        if (!isAirSupplying) {
            System.out.println("No air pressure. Roll back and try again");
            return;
        }
        isFuelSupplying = true;
        isEngineStarted = true;
        System.out.println("Supplying engine with fuel. ENGINE STARTED!");
    }

    public void fuelSupplyOff() {
        isFuelSupplying = false;
        isEngineStarted = false;
        System.out.println("Supplying engine with fuel is cut off. ENGINE STOPPED!");
    }

    public void plugOnGenerator() {
        if (!isEngineStarted) {
            System.out.println("Engine is stopped. Roll back and try again");
            return;
        }
        isGeneratorPlugged = true;
        isBatteryPlugged = false;
        isAPUActive = false;
        System.out.println("Generator is plugged on. ---[Battery is plugged out. APU is stopped]---");
    }

    public void plugOutGenerator() {
        isGeneratorPlugged = false;
        System.out.println("Generator is plugged out.");
    }

    public boolean isEngineStarted() {
        return isEngineStarted;
    }
}
