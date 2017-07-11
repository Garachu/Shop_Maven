package com.shop.product;

import java.util.List;

/**
 * Created by meg on 7/11/17.
 */
public interface ProductService {
    public List<Product> findAll();
    public void saveProduct(Product product);
    public Product findOne(long id);
    public void delete(long id);
    public List<Product> findByLabel(String label);
}
