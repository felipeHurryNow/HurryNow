/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.controller;

import com.hn.hurrynow.model.Store;
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
@RequestMapping("/stores")
public class StoreController {
 
    @Autowired
    IStub stub;
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Store>> getStores()throws ServicesHurryNowException{
        List<Store> c=stub.getStores();
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> postStore(@RequestBody Store store)throws ServicesHurryNowException{
        stub.postStore(store);
        return new ResponseEntity<>(HttpStatus.CREATED);
      
    }
    
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Store> getStoreById(@PathVariable long id)throws ServicesHurryNowException{
        Store c=stub.getStoreById(id);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
}