package com.shop;

import com.shop.product.Product;
import com.shop.product.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by meg on 7/11/17.
 */
@SpringBootApplication
public class MainEntry {

    private  static final Logger log = LoggerFactory.getLogger(MainEntry.class);



    public static void main(String args[]) {
        SpringApplication.run(MainEntry.class, args);
    }

    @Bean
    public CommandLineRunner demo(ProductService repository) {
        return (args) -> {
            //save a couple of courses
            repository.saveProduct(new Product("Introduction to java", "com.java"));
            repository.saveProduct(new Product("Data Structures And Algorithm", "com.datastructures"));
            repository.saveProduct(new Product("SQL", "com.java"));
            repository.saveProduct(new Product("Spring Boot", "com.springboot"));

            //fetch courses
            log.info("customers found with findAll():");
            log.info("-------------------");
            for (Product course : repository.findAll()) {
                log.info(course.getLabel() + " " + course.getDescription());
            }

            //find course by id
            Product course = repository.findOne(1L);
            log.info("Course found with findOne(1L)");
            log.info("-------------------");
            log.info(course.getLabel() + " " + course.getDescription());

        };
    }
}