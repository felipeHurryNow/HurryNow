/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.controller;

import com.hn.hurrynow.model.StoreCategory;
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
@RequestMapping("/storesCategory")
public class StoreCategoryController {
    
    @Autowired
    IStub stub;
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<StoreCategory>> getStoreCategorys()throws ServicesHurryNowException{
        List<StoreCategory> c=stub.getStoreCategorys();
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> postStoreCategory(@RequestBody StoreCategory storeCategory)throws ServicesHurryNowException{
       if(stub.getStoreCategoryById(storeCategory.getIdStoreCategory())==null){
            stub.postStoreCategory(storeCategory);            
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
      
    }
    
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<StoreCategory> getStoreCategoryById(@PathVariable long id)throws ServicesHurryNowException{
        StoreCategory c=stub.getStoreCategoryById(id);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
}