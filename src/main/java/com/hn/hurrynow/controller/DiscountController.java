/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.controller;

import com.hn.hurrynow.model.Discount;
import com.hn.hurrynow.persistence.ServicesHurryNowException;
import com.hn.hurrynow.stub.IStub;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juang
 */
@RestController
@RequestMapping("/discounts")
public class DiscountController {
    @Autowired
    IStub stub;
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Discount>> getDiscounts()throws ServicesHurryNowException{
        List<Discount> c=stub.getDiscounts();
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> postDiscount(@RequestBody Discount discount)throws ServicesHurryNowException{
       if(stub.getDiscountById(discount.getIdDiscount())==null){
            stub.postDiscount(discount);            
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
      
    }
    
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Discount> getDiscountById(@PathVariable long id)throws ServicesHurryNowException{
        Discount c=stub.getDiscountById(id);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
 
}

