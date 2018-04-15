/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.persistence;

import com.hn.hurrynow.model.Product;
import com.hn.hurrynow.model.ProductId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author juang
 */
public interface ProductRepository extends JpaRepository<Product, ProductId> {

    /*@Query("from Paciente p where size(p.consultas) >= :n")
    List<Paciente> listaPacientes(@Param(value="n") int n);    */

}
