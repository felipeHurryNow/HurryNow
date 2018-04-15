/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.controller;

import com.hn.hurrynow.model.Discount;
import com.hn.hurrynow.model.RecordDiscount;
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
@RequestMapping("/recordDiscounts")
public class DiscountRecordController {
    @Autowired
    IStub stub;
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<RecordDiscount>> getDiscountRecords()throws ServicesHurryNowException{
        List<RecordDiscount> c=stub.getDiscountRecords();
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> postDiscountRecord(@RequestBody RecordDiscount discountRecord)throws ServicesHurryNowException{
        stub.postDiscountRecord(discountRecord);
        return new ResponseEntity<>(HttpStatus.CREATED);
      
    }
    
    @RequestMapping(value="/{idD}/{idC}", method = RequestMethod.GET)
    public ResponseEntity<RecordDiscount> getDiscountById(@PathVariable long idD,@PathVariable long idC)throws ServicesHurryNowException{
        RecordDiscount c=stub.getDiscountRecordById(idD, idC);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
}
