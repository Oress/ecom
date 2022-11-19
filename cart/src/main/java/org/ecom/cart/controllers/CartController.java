package org.ecom.cart.controllers;

import org.ecom.cart.domain.model.Cart;
import org.ecom.cart.domain.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
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

    private final JmsTemplate jmsTemplate;

    @Autowired
    public CartController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @GetMapping
    public Cart getCart(@PathVariable String userId) {
        this.jmsTemplate.send("test", session -> session.createTextMessage("yo Yo yo my"));
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
