package org.ecom.cart.domain.event;

public interface EventStore {
    void addEvent(DomainEvent domainEvent);
}
