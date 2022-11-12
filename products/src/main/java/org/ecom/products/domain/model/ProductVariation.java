package org.ecom.products.domain.model;

import lombok.Data;

@Data
public class ProductVariation {
    private String sku;
    private Price price;
    private double quantity;
    private Options options;
}
