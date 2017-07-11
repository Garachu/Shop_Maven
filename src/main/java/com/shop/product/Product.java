package com.shop.product;

import com.shop.core.BaseEntity;

import javax.persistence.Entity;

/**
 * Created by meg on 7/11/17.
 */
@Entity
public class Product extends BaseEntity{

    private String label;
    private String description;

    protected  Product(){
        super();
    }

    public Product(String label, String description) {
        this.label = label;
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
