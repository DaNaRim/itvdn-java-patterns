package L21_State.states;

import L21_State.FlightControlSystem;
import L21_State.FlightPhase;
import L21_State.states.interfaces.State;

public class TakeOffState extends State {

    public TakeOffState() {
        super.setLandingGearsExtended(true);
        this.setFlapsExtended(true);
        this.setDroneOnTheGround(true);
        this.setAltitude(0);
        this.setFlightPhase(FlightPhase.ON_THE_GROUND);
        System.out.println("ready for take off");
    }

    @Override
    public void takeOff(FlightControlSystem flightControlSystem) {
        System.out.print("Take off in progress");
        for (int i = 0; i < 5; i++) {
            this.timeout(1000);
            System.out.print(".");
        }
        System.out.println(".");
        flightControlSystem.setState(new EnRouteFlightState(3000));
        this.getStatusOfFlight();
    }

    @Override
    public void climb(FlightControlSystem flightControlSystem, int altitude) {
        System.out.println();
        System.out.println("The Drone is taking off");
    }

    @Override
    public void descent(FlightControlSystem flightControlSystem, int altitude) {
        System.out.println();
        System.out.println("The Drone is taking off");
    }

    @Override
    public void landing(FlightControlSystem flightControlSystem) {
        System.out.println();
        System.out.println("The Drone is taking off");
    }

}
