/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author felip
 */

@Entity
@Table(name="clients")
public class Client implements Serializable {
    private Long   id_client;
    private String email; 
    private String password;
    private String name; 
    private String last_name; 
    private Long    phone; 
    private Long    points; 
    private String address; 

    public Client() {
    }

    public Client(Long id_client, String email, String password, String name, String last_name, Long phone, Long points, String address) {
        this.id_client = id_client;
        this.email = email;
        this.password = password;
        this.name = name;
        this.last_name = last_name;
        this.phone = phone;
        this.points = points;
        this.address = address;
    }
    
    @Id
    @Column(name = "id_client", nullable = false, length = 16)
    public Long getIdClient() {
        return id_client;
    }

    public void setIdClient(Long id_client) {
        this.id_client = id_client;
    }
    
    @Column(name = "email", nullable = false, length = 60)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name = "password", nullable = false, length = 40)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name = "last_name", nullable = false, length = 30)
    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }
    
    @Column(name = "phone", nullable = false, length = 20)
    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Column(name = "points", nullable = false, length = 16)
    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }
    
    @Column(name = "address", nullable = false, length = 60)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
