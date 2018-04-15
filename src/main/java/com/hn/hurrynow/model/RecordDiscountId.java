/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.model;

import static java.lang.Math.toIntExact;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author juang
 */
@Embeddable
public class RecordDiscountId implements java.io.Serializable {
    private Long idClient;
    private Long idDiscount;
    
    public RecordDiscountId() {
    }

    public RecordDiscountId(Long idClient, Long idDiscount) {
        this.idClient = idClient;
        this.idDiscount = idDiscount;
    }

    @Column(name="id_client", insertable = false, updatable = false)
    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    @Column(name="id_discount", insertable = false, updatable = false)
    public Long getIdDiscount() {
        return idDiscount;
    }

    public void setIdDiscount(Long idDiscount) {
        this.idDiscount = idDiscount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + toIntExact(this.idClient);
        hash = 47 * hash + toIntExact(this.idDiscount);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RecordDiscountId other = (RecordDiscountId) obj;
        if (this.idClient != other.idClient) {
            return false;
        }
        if (this.idDiscount != other.idDiscount) {
            return false;
        }
        return true;
    }
        
}
