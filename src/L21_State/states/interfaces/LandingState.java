package L21_State.states.interfaces;

import L21_State.FlightControlSystem;
import L21_State.FlightPhase;

public class LandingState extends State {

    public LandingState() {
        super.setLandingGearsExtended(true);
        this.setFlapsExtended(true);
        this.setDroneOnTheGround(false);
        this.setAltitude(3000);
        this.setFlightPhase(FlightPhase.LANDING_PATH);

        System.out.println("Ready to land");
    }

    @Override
    public void takeOff(FlightControlSystem flightControlSystem) {
        System.out.println();
        System.out.println("The Drone is going to land");
    }

    @Override
    public void climb(FlightControlSystem flightControlSystem, int altitude) {
        System.out.println();
        System.out.println("The Drone is going to land");
    }

    @Override
    public void descent(FlightControlSystem flightControlSystem, int altitude) {
        System.out.println();
        System.out.println("The Drone is going to land");
    }

    @Override
    public void landing(FlightControlSystem flightControlSystem) {
        this.getStatusOfFlight();
        System.out.print("Landing");
        for (int i = 0; i < 5; i++) {
            this.timeout(1000);
            System.out.print(".");
        }
        System.out.println(".");

        this.setAltitude(0);
        this.setDroneOnTheGround(true);
        this.setFlightPhase(FlightPhase.ON_THE_GROUND);
    }
}
