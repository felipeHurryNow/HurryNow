/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


/**
 *
 * @author felip
 */

@Entity
@Table(name="products")
public class Product implements Serializable {
    
    private ProductId       idProduct; 
    private BranchOffice    branchOffice; 
    private ProductCategory productCategory; 
    private String          description; 
    private double          price; 
    private char            enableDiscount; 
    private String          imageProduct; 

    public Product() {
    }

    public Product(ProductId idProduct, String description, double price, char enableDiscount, String imageProduct) {
        this.idProduct = idProduct;
        this.description = description;
        this.price = price;
        this.enableDiscount = enableDiscount;
        this.imageProduct = imageProduct; 
    }
    
    @EmbeddedId
    public ProductId getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(ProductId idProduct) {
        this.idProduct = idProduct;
    }

    @ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @JoinColumns({
        @JoinColumn(name="id_branch_office", insertable = false, updatable = false),
        @JoinColumn(name="id_store", insertable = false, updatable = false)
    })
    public BranchOffice getBranchOffice() {
        return branchOffice;
    }

    public void setBranchOffice(BranchOffice branchOffice) {
        this.branchOffice = branchOffice;
    }
    
    @ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name="id_product_category", nullable = false)
    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
    
    @Column(name = "description", nullable = false, length = 200)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
     
    @Column(name = "price", nullable = false)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Column(name = "enable_discount", nullable = false, length = 1)
    public char getEnableDiscount() {
        return enableDiscount;
    }

    public void setEnableDiscount(char enableDiscount) {
        this.enableDiscount = enableDiscount;
    }

    @Column(name = "image_product", nullable = false, length = 1000000)
    public String getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(String imageProduct) {
        this.imageProduct = imageProduct;
    }
    
    
    
}
