package L20_Observer.controlPanelsSubscribers;

import L20_Observer.events.Event;

public interface Subscriber {

    void updateContext(Event event);
}
