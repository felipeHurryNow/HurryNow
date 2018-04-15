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
@Table(name="stores_category")
public class StoreCategory {
    
    private Long    idStoreCategory;
    private String  description;

    public StoreCategory() {
    }

    public StoreCategory(Long idStoreCategory, String description) {
        this.idStoreCategory = idStoreCategory;
        this.description = description;
    }
    
    @Id
    @Column(name="id_store_category", unique=true, nullable=false, length = 16)
    public Long getIdStoreCategory() {
        return idStoreCategory;
    }

    public void setIdStoreCategory(Long idStoreCategory) {
        this.idStoreCategory = idStoreCategory;
    }

    @Column(name="description", unique=true, nullable=false, length = 50)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }   
    
}
