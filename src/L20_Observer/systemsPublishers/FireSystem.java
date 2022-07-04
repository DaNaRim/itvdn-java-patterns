package L20_Observer.systemsPublishers;

import L20_Observer.events.Event;
import L20_Observer.events.FireSystemEvents;
import L20_Observer.statuses.FireSystemStatus;

public class FireSystem implements Publisher {

    private FireSystemStatus status;
    private final Event event;

    public FireSystem(FireSystemEvents event) {
        this.status = FireSystemStatus.NORMAL;
        this.event = event;
    }

    public FireSystemStatus getStatus() {
        return status;
    }

    public void setStatus(FireSystemStatus status) {
        this.status = status;
        this.notifySubscribers(event);
    }
}
