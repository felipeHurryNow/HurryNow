/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.controller;

import com.hn.hurrynow.model.BranchOffice;
import com.hn.hurrynow.model.Product;
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
@RequestMapping("/branchOffices")

public class BranchOfficeController {
    @Autowired
    IStub stub;
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<BranchOffice>> getBranchOffices()throws ServicesHurryNowException{
        List<BranchOffice> c=stub.getBranchOffices();
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> postBranchOffice(@RequestBody BranchOffice branchOffice)throws ServicesHurryNowException{
        stub.postBranchOffice(branchOffice);
        return new ResponseEntity<>(HttpStatus.CREATED);
      
    }
    
    @RequestMapping(value="/{idBO}/{idS}", method = RequestMethod.GET)
    public ResponseEntity<BranchOffice> getBranchOfficeById(@PathVariable long idBO, @PathVariable long idS)throws ServicesHurryNowException{
        BranchOffice c=stub.getBranchOfficeById(idBO, idS);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
    
}
