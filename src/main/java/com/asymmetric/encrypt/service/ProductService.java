package com.asymmetric.encrypt.service;

import com.asymmetric.encrypt.model.Product;
import com.asymmetric.encrypt.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    
    private final ProductRepository productRepository;
    
    public Product save(Product product) {
        return productRepository.save(product);
    }
    
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }
    
    public List<Product> findALL() {
        return productRepository.findAll();
    }
}
