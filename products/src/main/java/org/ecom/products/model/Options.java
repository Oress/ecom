package org.ecom.products.model;


import lombok.Data;

import java.util.List;

@Data
public class Options {
    private List<String> features;
    private List<String> colors;
    private String image;
}
