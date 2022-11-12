package org.ecom.products.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Category {
    private String category;
    private String image;
}
