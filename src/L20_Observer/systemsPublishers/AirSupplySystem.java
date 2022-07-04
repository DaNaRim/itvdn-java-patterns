package L20_Observer.systemsPublishers;

import L20_Observer.events.AirSupplySystemEvents;
import L20_Observer.events.Event;
import L20_Observer.statuses.AirSystemStatus;

public class AirSupplySystem implements Publisher {

    private AirSystemStatus status;
    private final Event event;

    public AirSupplySystem(AirSupplySystemEvents event) {
        this.status = AirSystemStatus.NORMAL;
        this.event = event;
    }

    public AirSystemStatus getStatus() {
        return status;
    }

    public void setStatus(AirSystemStatus status) {
        this.status = status;
        this.notifySubscribers(event);
    }
}
