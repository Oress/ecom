package org.ecom.cart.repository;

import org.ecom.cart.domain.model.Cart;

public interface CartRepository {
    Cart getByUserId(String userId);
}
