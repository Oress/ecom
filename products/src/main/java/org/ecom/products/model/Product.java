package org.ecom.products.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Product {
    private String id;
    private String code;
    private String name;
    private String description;
    private List<String> categories;
    private List<ProductVariation> variations;
}
