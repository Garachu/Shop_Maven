package com.shop.product;

import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by meg on 7/11/17.
 */
public interface ProductOwnRepository extends Repository<Product, Long>{
    List<Product> findByLabel(String label);
}
