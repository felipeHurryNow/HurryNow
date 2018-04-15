/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.stub;

import com.hn.hurrynow.model.BranchOffice;
import com.hn.hurrynow.model.Client;
import com.hn.hurrynow.model.RecordDiscount;
import com.hn.hurrynow.model.Discount;
import com.hn.hurrynow.model.Product;
import com.hn.hurrynow.model.ProductCategory;
import com.hn.hurrynow.model.Store;
import com.hn.hurrynow.model.StoreCategory;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author MercaYApp
 */

//@Service
public class Stub implements IStub {

    List<Product> listProducts = new ArrayList<>();
    
    public Stub() {
        
        Set<Product> setP=new HashSet<>();
        Product p = null;//new Product(1, 1, 1999.0, 1, 'S', "jabon barato", 1);
        setP.add(p);
        listProducts.add(p);
        
    }

    
    @Override
    public List<Product> getProducts() {
        return listProducts;
    }

    @Override
    public Product getProductById(Long idProduct, Long idStore) {
        Product prod = null;
        /*boolean banderita = false;
        for (int i = 0; i < listProducts.size() && !banderita; i++) {
            if (listProducts.get(i).getIdProductos() == id) {
                prod = listProducts.get(i);
                banderita = true;
            }
        }*/
        return prod;

    }
    
    @Override
    public void postProduct(Product p) {
        listProducts.add(p);
    }

    @Override
    public List<BranchOffice> getBranchOffices() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Client> getClients() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<RecordDiscount> getDiscountRecords() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Discount> getDiscounts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProductCategory> getProductCategorys() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Store> getStores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StoreCategory> getStoreCategorys() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BranchOffice getBranchOfficeById(Long idBranchOffice, Long idStore) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Client getClientById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RecordDiscount getDiscountRecordById(Long idClient, Long idDiscount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Discount getDiscountById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ProductCategory getProductCategoryById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Store getStoreById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public StoreCategory getStoreCategoryById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postBranchOffice(BranchOffice bo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postClient(Client c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postDiscountRecord(RecordDiscount dr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postDiscount(Discount d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postProductCategory(ProductCategory pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postStore(Store s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postStoreCategory(StoreCategory s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
