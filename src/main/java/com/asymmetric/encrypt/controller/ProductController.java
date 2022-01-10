package com.asymmetric.encrypt.controller;

import com.asymmetric.encrypt.model.Product;
import com.asymmetric.encrypt.service.encrypt.Encryption;
import com.asymmetric.encrypt.service.ProductService;
import com.asymmetric.encrypt.service.encrypt.RSAEncryption;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {
    
    private final ProductService productService;
    
    private final RSAEncryption rsaEncryption;
    
    @RequestMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id) {
        
        String encodedMessage = rsaEncryption.encrypt("Eu sou Cruzeiro meu pai");
        String message = rsaEncryption.decrypt(encodedMessage);
        System.out.println(encodedMessage);
        System.out.println(message);
        
        Product product = productService.findById(id);
        return ResponseEntity.ok(product);
    }
}
