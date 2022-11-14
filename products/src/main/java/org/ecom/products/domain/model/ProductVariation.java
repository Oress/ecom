package org.ecom.products.domain.model;

import lombok.Data;

@Data
public class ProductVariation {
    private String id;
    private String sku;
    private String type;
    private String title;
    private String code;
    private double quantity;
    private Price price;
    private FeatureGroups features;
}
