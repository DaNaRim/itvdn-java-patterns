package L20_Observer.systemsPublishers;

import L20_Observer.controlPanelsSubscribers.Subscriber;
import L20_Observer.events.Event;

import java.util.HashSet;
import java.util.Set;

public interface Publisher {

    Set<Event> events = new HashSet<>();

    default void subscribe(Event event, Subscriber subscriber) {
        if (events.contains(event)) {
            for (Event e : events) {
                if (e.equals(event)) e.getListOfSubscribers().add(subscriber);
            }
        } else {
            event.getListOfSubscribers().add(subscriber);
            events.add(event);
        }
        System.out.printf("The object %s has been subscribed for the event: %s%n",
                subscriber.getClass().getSimpleName(), event.getEventName());
    }

    default void unSubscribe(Event event, Subscriber subscriber) {
        if (!events.contains(event)) {
            System.out.println("No such event!");
            return;
        }

        for (Event e : events) {
            if (e.equals(event)) {
                e.getListOfSubscribers().remove(subscriber);
                System.out.println("Subscription was removed!");
                break;
            }
        }
    }

    default void notifySubscribers(Event event) {
        for (Subscriber subscriber : event.getListOfSubscribers()) {
            subscriber.updateContext(event);
        }
    }
}
