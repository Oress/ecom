package org.ecom.cart.domain.model;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Price {
    private double base;
    private String currency;
    private double discount;
}
