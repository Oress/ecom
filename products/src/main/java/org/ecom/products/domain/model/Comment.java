package org.ecom.products.domain.model;

import lombok.Data;

import java.util.Date;

@Data
public class Comment {
    private String id;
    private String comment;
    private String userId;
    private String userName;
    private Date createdDate;
    private boolean isRemoved;
}
