/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author juang
 */
@Entity
@Table(name="record_discounts")
public class RecordDiscount {
    private RecordDiscountId recDisId;

    public RecordDiscount() {
    }

    public RecordDiscount(RecordDiscountId recDisId) {
        this.recDisId = recDisId;
    }
    
    @EmbeddedId
    public RecordDiscountId getDisRecId() {
        return recDisId;
    }

    public void setDisRecId(RecordDiscountId recDisId) {
        this.recDisId = recDisId;
    }

    
    
}
