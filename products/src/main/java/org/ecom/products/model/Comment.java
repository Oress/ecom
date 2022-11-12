package org.ecom.products.model;

import lombok.Data;

import java.util.Date;

@Data
public class Comment {
    private String comment;
    private String userId;
    private String userName;
    private Date createdDate;
    private boolean isRemoved;
}
