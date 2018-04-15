/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.controller;

import com.hn.hurrynow.model.Client;
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
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    IStub stub;
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Client>> getClients()throws ServicesHurryNowException{
        List<Client> c=stub.getClients();
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> postClient(@RequestBody Client client)throws ServicesHurryNowException{
       if(stub.getClientById(client.getIdClient())==null){
            stub.postClient(client);            
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
      
    }
    
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Client> getClientById(@PathVariable long id)throws ServicesHurryNowException{
        Client c=stub.getClientById(id);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
    
}