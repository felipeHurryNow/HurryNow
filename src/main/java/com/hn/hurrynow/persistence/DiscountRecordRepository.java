/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.persistence;

import com.hn.hurrynow.model.RecordDiscount;
import com.hn.hurrynow.model.RecordDiscountId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author juang
 */
public interface DiscountRecordRepository extends JpaRepository<RecordDiscount, RecordDiscountId> {
    
}
