package org.ecom.products.domain.repository;

import org.ecom.products.domain.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, String> {
    Optional<Product> findByCode(String code);
}
