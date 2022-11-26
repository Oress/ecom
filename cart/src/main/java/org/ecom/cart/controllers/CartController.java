package org.ecom.cart.controllers;

import org.ecom.cart.domain.model.Cart;
import org.ecom.cart.domain.model.Price;
import org.ecom.cart.domain.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/{userId}/cart")
public class CartController {
//    private final CartRepository cartRepository;
//
//    @Autowired
//    public CartController(CartRepository cartRepository) {
//        this.cartRepository = cartRepository;
//    }

    private final JmsMessagingTemplate jmsTemplate;

    @Autowired
    public CartController(JmsMessagingTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @GetMapping
    public Cart getCart(@PathVariable String userId) {
        Price p = new Price();
        p.setBase(123);
        p.setDiscount(421);
        p.setCurrency("USD");
        this.jmsTemplate.convertAndSend("test", p);
        return null;
    }

    @PutMapping("/add")
    public Cart addToCard(@PathVariable Product userId) {
        return null;
    }

    @PostMapping("/clear")
    public Cart clear(@PathVariable Product userId) {
        return null;
    }
}
