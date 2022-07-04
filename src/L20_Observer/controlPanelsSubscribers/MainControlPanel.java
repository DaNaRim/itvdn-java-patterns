package L20_Observer.controlPanelsSubscribers;

import L20_Observer.events.Event;
import L20_Observer.systemsPublishers.AirSupplySystem;
import L20_Observer.systemsPublishers.FireSystem;
import L20_Observer.systemsPublishers.PowerSupplySystem;

public class MainControlPanel implements Subscriber {

    private final AirSupplySystem airSupplySystem;
    private final FireSystem fireSystem;
    private final PowerSupplySystem powerSupplySystem;

    public MainControlPanel(AirSupplySystem airSupplySystem,
                            FireSystem fireSystem,
                            PowerSupplySystem powerSupplySystem) {
        this.airSupplySystem = airSupplySystem;
        this.fireSystem = fireSystem;
        this.powerSupplySystem = powerSupplySystem;
    }

    @Override
    public void updateContext(Event event) {
        System.out.println("Main control panel:");

        switch (event.getEventName()) {
            case "AirSupplySystemEvents" ->
                    System.out.println("Air supply system status: " + airSupplySystem.getStatus());
            case "FireSystemEvents" -> System.out.println("Fire system status: " + fireSystem.getStatus());
            case "PowerSystemEvents" ->
                    System.out.println("Power supply system status: " + powerSupplySystem.getStatus());
        }
    }
}
