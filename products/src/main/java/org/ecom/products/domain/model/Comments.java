package org.ecom.products.domain.model;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Comments {
    private String productId;
    private List<Comment> comments;
}
