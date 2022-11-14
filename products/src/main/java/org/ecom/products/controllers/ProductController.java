package org.ecom.products.controllers;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.ecom.products.domain.repository.ProductRepository;
import org.ecom.products.dto.ProductSearchCriteria;
import org.ecom.products.domain.model.Product;
import org.ecom.products.dto.OperationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getByCriteria(@ModelAttribute ProductSearchCriteria searchCriteria) {
        List<Product> result = new ArrayList<>();

        if (!searchCriteria.isEmpty()) {
            if (StringUtils.isNotBlank(searchCriteria.getCode())) {
                Optional<Product> product = this.productRepository.findByCode(searchCriteria.getCode());
                product.ifPresent(result::add);
            }
        }

        return result;
    }

    @PutMapping
    public OperationResult saveOrUpdateProducts(@RequestBody List<Product> products) {
        OperationResult result = null;

        for (Product product : products) {

        }

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
