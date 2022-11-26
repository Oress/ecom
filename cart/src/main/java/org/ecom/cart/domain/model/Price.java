package org.ecom.cart.domain.model;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class Price implements Serializable {
    private double base;
    private String currency;
    private double discount;
}
