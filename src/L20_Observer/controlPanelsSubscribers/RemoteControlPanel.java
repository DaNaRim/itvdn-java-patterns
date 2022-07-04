package L20_Observer.controlPanelsSubscribers;

import L20_Observer.events.Event;
import L20_Observer.systemsPublishers.AirSupplySystem;
import L20_Observer.systemsPublishers.FireSystem;

public class RemoteControlPanel implements Subscriber {

    private final AirSupplySystem airSupplySystem;
    private final FireSystem fireSystem;

    public RemoteControlPanel(AirSupplySystem airSupplySystem, FireSystem fireSystem) {
        this.airSupplySystem = airSupplySystem;
        this.fireSystem = fireSystem;
    }

    @Override
    public void updateContext(Event event) {
        System.out.println("Remote control panel:");

        if (event.getEventName().equals("AirSupplySystemEvents")) {
            System.out.println("Air supply system status: " + airSupplySystem.getStatus());
        } else if (event.getEventName().equals("FireSystemEvents")) {
            System.out.println("Fire system status: " + fireSystem.getStatus());
        }
    }
}
