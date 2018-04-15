/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author felip
 */
@Entity
@Table(name = "branch_offices")
public class BranchOffice implements Serializable {
    
    private BranchOfficeId  idBranchOffice; 
    private String          address; 
    private String          local; 
    private int             phone; 
    private double          latitude; 
    private double          longitude; 
    private String          atentionTime; 

    public BranchOffice() {
    }

    public BranchOffice(BranchOfficeId idBranchOffice, String address, String local, int phone, double latitude, double longitude) {
        this.idBranchOffice = idBranchOffice;
        this.address = address;
        this.local = local;
        this.phone = phone;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    @EmbeddedId
    public BranchOfficeId getIdBranchOffice() {
        return idBranchOffice;
    }

    public void setIdBranchOffice(BranchOfficeId idBranchOffice) {
        this.idBranchOffice = idBranchOffice;
    }
    
    @Column(name = "address", nullable = false, length = 60)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "local", nullable = false, length = 6)
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    @Column(name = "phone", nullable = false, length = 13)
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Column(name = "latitude", nullable = false)
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Column(name = "longitude", nullable = false)
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Column(name = "atention_time", nullable = false, length = 20)
    public String getAtentionTime() {
        return atentionTime;
    }

    public void setAtentionTime(String atentionTime) {
        this.atentionTime = atentionTime;
    }
    
    
    
    
}
