package org.ecom.products.domain.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Product {
    private String id;
    private String code;
    private String title;
    private String description;
//    private String producer;
    private String category;
    private boolean isActive;
    private List<ProductVariation> variations;
}
