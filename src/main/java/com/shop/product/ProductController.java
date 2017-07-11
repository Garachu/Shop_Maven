package com.shop.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by meg on 7/11/17.
 */


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/add")
    public Product addProduct(@PathVariable String label, @PathVariable String description) {

        Product product = new Product();
        product.setLabel(label);
        product.setDescription(description);
        productService.saveProduct(product);
        return product;
    }

    @RequestMapping("/list")
    public List<Product> getProducts() {
        return productService.findAll();
    }
}
