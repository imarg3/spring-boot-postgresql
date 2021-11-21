package com.arpitram.postgresql.service;

import com.arpitram.postgresql.model.Product;
import com.arpitram.postgresql.repository.ProductRepository;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
}
