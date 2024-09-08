package org.example.msproductservice.service;


import org.example.msproductservice.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Product> list();
    public Product save(Product product);
    public Product update(Product product);
    public Optional<Product> findById(Integer id);
    public void deleteById(Integer id);
}
