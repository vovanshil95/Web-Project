package com.WebProject.repository;

import com.WebProject.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository <ProductEntity, Integer> {

}
