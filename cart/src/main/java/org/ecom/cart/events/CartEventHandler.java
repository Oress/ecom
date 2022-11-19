package org.ecom.cart.events;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class CartEventHandler {

    @JmsListener(destination = "cartEvents")
    public void processMessage(String content) {

    }
}