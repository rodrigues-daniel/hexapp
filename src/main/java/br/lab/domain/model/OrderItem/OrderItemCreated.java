package br.lab.domain.model.OrderItem;

import br.lab.common.Event.DomainEvent;

import java.util.Date;

public class OrderItemCreated implements DomainEvent {

    private Date occurredOn;
    public OrderItemCreated() {
        super();
        setOccurredOn(new Date());
    }

    @Override
    public Date occurredOn() {
        return getOccurredOn();
    }

    public Date getOccurredOn() {
        return occurredOn;
    }

    public void setOccurredOn(Date occurredOn) {
        this.occurredOn = occurredOn;
    }
}
