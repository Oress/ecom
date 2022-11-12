package org.ecom.products.model;

import lombok.Data;

@Data
public class Price {
    private double base;
    private String currency;
    private double discount;
}
