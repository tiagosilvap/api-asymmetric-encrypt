package com.asymmetric.encrypt.service;

import com.asymmetric.encrypt.model.Product;
import com.asymmetric.encrypt.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    
    Product save(Product product);
    
    Product findById(Long id);
    
    public List<Product> findALL();
    
}
