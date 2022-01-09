package com.asymmetric.encrypt.controller;

import com.asymmetric.encrypt.model.Product;
import com.asymmetric.encrypt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @Value("${app.pass.private}")
    private String privatePass;
    
    @Value("${app.pass.public}")
    private String publicPass;
    
    @RequestMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id) {
        System.err.println(privatePass);
        System.err.println(publicPass);
        Product product = productService.findById(id);
        return ResponseEntity.ok(product);
    }
}
