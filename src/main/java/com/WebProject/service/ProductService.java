package com.WebProject.service;

import com.WebProject.entity.ProductEntity;
import com.WebProject.model.Product;
import com.WebProject.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public List<ProductEntity> getAllProducts() {
        return StreamSupport.stream(productRepo.findAll().
                spliterator(), false).collect(Collectors.toList());
    }

//    public List<Product> getProductsForTape() {
//        return StreamSupport.stream(productRepo.findAll().spliterator(), false).;
//    }

}
