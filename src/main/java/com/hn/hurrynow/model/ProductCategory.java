/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author juang
 */
@Entity
@Table(name="products_category")
public class ProductCategory {
 
    private Long    idProductCategory;
    private String  description;

    public ProductCategory() {
    }

    public ProductCategory(Long idProductCategory, String description) {
        this.idProductCategory = idProductCategory;
        this.description = description;
    }
    
    @Id
    @Column(name="id_product_category", unique=true, nullable=false, length = 16)
    public Long getIdProductCategory() {
        return idProductCategory;
    }

    public void setIdProductCategory(Long idProductCategory) {
        this.idProductCategory = idProductCategory;
    }

    @Column(name="description", unique=true, nullable=false, length = 50)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
