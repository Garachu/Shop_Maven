package com.shop.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by meg on 7/11/17.
 */

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ProductOwnRepository ownRepository;

    @Override
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }

    @Override
    public void saveProduct(Product product) {
        repository.save(product);

    }

    @Override
    public Product findOne(long id) {
        return repository.findOne(id);
    }

    @Override
    public void delete(long id) {
        repository.delete(id);

    }

    @Override
    public List<Product> findByLabel(String label) {
        return ownRepository.findByLabel(label);
    }
}
