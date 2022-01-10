package com.asymmetric.encrypt.service.impl;

import com.asymmetric.encrypt.model.Product;
import com.asymmetric.encrypt.repository.ProductRepository;
import com.asymmetric.encrypt.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    
    private final ProductRepository productRepository;
    
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
    
    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }
    
    @Override
    public List<Product> findALL() {
        return productRepository.findAll();
    }
}
