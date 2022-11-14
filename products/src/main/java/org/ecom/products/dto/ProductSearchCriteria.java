package org.ecom.products.dto;

import lombok.Data;

@Data
public class ProductSearchCriteria {
    private static ProductSearchCriteria EMPTY_CRITERIA = new ProductSearchCriteria();

    private String code;

    public boolean isEmpty() {
        return EMPTY_CRITERIA.equals(this);
    }
}
