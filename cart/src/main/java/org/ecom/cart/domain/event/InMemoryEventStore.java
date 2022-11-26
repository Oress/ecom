package org.ecom.cart.domain.event;

import java.util.Deque;
import java.util.LinkedList;

public class InMemoryEventStore implements EventStore {
    private final Deque<DomainEvent> eventStore = new LinkedList<>();

    @Override
    public void addEvent(DomainEvent domainEvent) {
        eventStore.add(domainEvent);
    }
}
