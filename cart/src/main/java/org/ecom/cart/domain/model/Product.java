package org.ecom.cart.domain.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product extends AbstractPersistable<Long> {

    @ManyToOne
    private Cart cart;

    private Integer quantity;
    private String productId;
    private String name;
    private Price price;
}
