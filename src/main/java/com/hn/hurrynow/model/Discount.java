/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author juang
 */
@Entity
@Table(name="discounts")
public class Discount {
    private Long    idDiscount;
    private Long    idProduct;
    private Date    startDate;
    private Date    endDate;
    private int     discountsNumber;
    private String  description;
    private double  price;

    public Discount() {
    }

    public Discount(Long idDiscount, Long idProduct, Date startDate, Date endDate, int discountsNumber, String description, double price) {
        this.idDiscount = idDiscount;
        this.idProduct = idProduct;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discountsNumber = discountsNumber;
        this.description = description;
        this.price = price;
    }
    
    @Id
    @Column(name="id_discount", unique=true, nullable=false, length = 16)
    public Long getIdDiscount() {
        return idDiscount;
    }

    public void setIdDiscount(Long idDiscount) {
        this.idDiscount = idDiscount;
    }

    @Column(name="id_product", unique=true, nullable=false)
    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }
    
    @Column(name="start_date", unique=true, nullable=false)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    @Column(name="end_date", unique=true, nullable=false)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    @Column(name="discounts_number", unique=true, nullable=false, length = 16)
    public int getDiscountsNumber() {
        return discountsNumber;
    }

    public void setDiscountsNumber(int discountsNumber) {
        this.discountsNumber = discountsNumber;
    }
    
    @Column(name="description", unique=true, nullable=false, length = 200)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="price", unique=true, nullable=false)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
