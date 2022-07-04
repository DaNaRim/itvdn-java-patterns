package L20_Observer.events;

import L20_Observer.controlPanelsSubscribers.Subscriber;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Event {

    private final String eventName;
    private final Set<Subscriber> listOfSubscribers;

    protected Event(String eventName) {
        this.eventName = eventName;
        this.listOfSubscribers = new HashSet<>();
    }

    public Set<Subscriber> getListOfSubscribers() {
        return listOfSubscribers;
    }

    public String getEventName() {
        return eventName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(eventName, event.eventName);
    }
}
