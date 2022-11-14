package org.ecom.products.domain.service;

import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.ecom.products.domain.model.Product;
import org.ecom.products.domain.repository.ProductRepository;
import org.ecom.products.dto.OperationResult;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final MongoTemplate mongoTemplate;

    public ProductService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public OperationResult saveOrUpdate(@NonNull Product incoming) {
        Product persistent = tryGetProduct(incoming);
        if (persistent != null) {
            // handle update
        } else {
            // handle update
        }
    }


    private Product tryGetProduct(Product incoming) {
        Product result = null;
        // get by code product and variations

        String code = incoming.getCode();
        if (StringUtils.isNotBlank(code)) {
            mongoTemplate.find(Query.query(Criteria.where("code").is(code)
                    .orOperator(Criteria.where("variations.code").is(code))),Product.class);
        }

        return result;
    }
}
