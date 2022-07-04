package L20_Observer.systemsPublishers;

import L20_Observer.events.Event;
import L20_Observer.events.PowerSystemEvents;
import L20_Observer.statuses.PowerSystemStatus;

public class PowerSupplySystem implements Publisher {

    private PowerSystemStatus status;
    private final Event event;

    public PowerSupplySystem(PowerSystemEvents event) {
        this.status = PowerSystemStatus.NORMAL;
        this.event = event;
    }

    public PowerSystemStatus getStatus() {
        return status;
    }

    public void setStatus(PowerSystemStatus status) {
        this.status = status;
        this.notifySubscribers(event);
    }
}
