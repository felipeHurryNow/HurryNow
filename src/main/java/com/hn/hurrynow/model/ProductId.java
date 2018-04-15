/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.model;

import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author juang
 */
@Embeddable
public class ProductId  implements java.io.Serializable{
    private Long idProduct;
    private Long idStore;

    public ProductId() {
    }

    public ProductId(Long idProduct, Long idStore) {
        this.idProduct = idProduct;
        this.idStore = idStore;
    }
    

    @Column(name="id_product", insertable = false, updatable = false)
    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }
    
    /*@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name="id_store")*/
    @Column(name="id_store", insertable = false, updatable = false)
    public Long getIdStore() {
        return idStore;
    }

    public void setIdStore(Long idStore) {
        this.idStore = idStore;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.idProduct);
        hash = 79 * hash + Objects.hashCode(this.idStore);
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
        final ProductId other = (ProductId) obj;
        if (!Objects.equals(this.idProduct, other.idProduct)) {
            return false;
        }
        if (!Objects.equals(this.idStore, other.idStore)) {
            return false;
        }
        return true;
    }
    
    
    
}
