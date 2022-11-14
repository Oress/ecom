package org.ecom.products.domain.model;


import lombok.Data;

import java.util.List;

@Data
public class FeatureGroups {
    private String groupCode;
    private List<Feature> features;
}
