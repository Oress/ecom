package org.ecom.products.domain.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Category {
    private String category;
    private String image;
    private List<Category> subcategories;
}
