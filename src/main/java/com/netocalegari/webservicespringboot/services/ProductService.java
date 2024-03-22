package com.netocalegari.webservicespringboot.services;

import com.netocalegari.webservicespringboot.entities.Product;
import com.netocalegari.webservicespringboot.entities.User;
import com.netocalegari.webservicespringboot.repositories.ProductRepository;
import com.netocalegari.webservicespringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
