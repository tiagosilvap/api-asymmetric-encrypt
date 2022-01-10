package com.asymmetric.encrypt.controller;

import com.asymmetric.encrypt.model.Product;
import com.asymmetric.encrypt.service.impl.ProductServiceImpl;
import com.asymmetric.encrypt.service.RSAEncryption;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {
    
    private final ProductServiceImpl productService;
    
    @RequestMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id) {
        Product product = productService.findById(id);
        return ResponseEntity.ok(product);
    }
}
