package behavioral.observer.eventapproach;

import java.util.HashMap;
import java.util.Map;
// Consumer has an accept() method
import java.util.function.Consumer;

// Event is the idea that someting happends
// We can subscribe to this event to get notifications
// TArgs is the actual data that is fired as the event is fired
public class Event<TArgs> {
    private int count = 0;
    // map of subscribers
    private Map<Integer, Consumer<TArgs>> handlers = new HashMap<>();

    // I want to give some memento back to whoever subscribe to this event, memento
    // pattern. It receives an arrow function
    public Subscription addHandler(Consumer<TArgs> handler) {
        int i = count;
        handlers.put(count++, handler);
        return new Subscription(this, i);
    }

    // notify when something happens
    public void fire(TArgs args) {
        for (Consumer<TArgs> handler : handlers.values()) {
            // inherited from Consumer
            handler.accept(args);
        }
    }

    public class Subscription implements AutoCloseable {

        private Event<TArgs> event;
        private int id; // index to handlers map, it allow us to handle unsubscriptions

        public Subscription(Event<TArgs> event, int id) {
            this.event = event;
            this.id = id;
        }

        // call to unsubscribe
        @Override
        public void close() {
            event.handlers.remove(id);
        }

    }
}
