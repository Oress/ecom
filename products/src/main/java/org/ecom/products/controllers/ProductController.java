package org.ecom.products.controllers;

import org.ecom.products.dto.ProductSearchCriteria;
import org.ecom.products.domain.model.Product;
import org.ecom.products.dto.OperationResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<Product> getByCriteria(@ModelAttribute ProductSearchCriteria searchCriteria) {
        List<Product> result = null;
        return result;
    }

    @PutMapping
    public OperationResult saveOrUpdateProducts(@RequestBody List<Product> products) {
        OperationResult result = null;
        return result;
    }

    @PostMapping
    public OperationResult removeProducts(@RequestBody List<Product> products) {
        OperationResult result = null;
        return result;
    }

/*
    @PostMapping
    public OperationResult rate(@RequestBody List<Product> products) {
        OperationResult result = null;
        return result;
    }
*/
}
