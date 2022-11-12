package org.ecom.products.controllers;

import org.ecom.products.domain.model.Comment;
import org.ecom.products.domain.model.Comments;
import org.ecom.products.domain.model.Product;
import org.ecom.products.dto.OperationResult;
import org.ecom.products.dto.ProductSearchCriteria;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products/{code}/comments")
public class CommentController {

    @GetMapping
    public List<Comment> getAll() {
        List<Comment> result = null;
        return result;
    }

    @PutMapping
    public OperationResult addComment(@RequestBody Comment comment) {
        OperationResult result = null;
        return result;
    }

    @PostMapping
    public OperationResult removeComment(@RequestBody Comment comment) {
        OperationResult result = null;
        return result;
    }

}
