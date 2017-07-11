package com.shop.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by meg on 7/11/17.
 */
public interface ProductRepository extends CrudRepository<Product, Long>{
}
