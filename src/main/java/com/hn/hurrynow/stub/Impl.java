/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.stub;

import com.hn.hurrynow.model.BranchOffice;
import com.hn.hurrynow.model.BranchOfficeId;
import com.hn.hurrynow.model.Client;
import com.hn.hurrynow.model.RecordDiscount;
import com.hn.hurrynow.model.Discount;
import com.hn.hurrynow.model.RecordDiscountId;
import com.hn.hurrynow.model.Product;
import com.hn.hurrynow.model.ProductCategory;
import com.hn.hurrynow.model.ProductId;
import com.hn.hurrynow.model.Store;
import com.hn.hurrynow.model.StoreCategory;
import com.hn.hurrynow.persistence.BranchOfficeRepository;
import com.hn.hurrynow.persistence.ClientRepository;
import com.hn.hurrynow.persistence.DiscountRecordRepository;
import com.hn.hurrynow.persistence.DiscountRepository;
import com.hn.hurrynow.persistence.ProductCategoryRepository;
import java.util.Iterator;

import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hn.hurrynow.persistence.ProductRepository;
import com.hn.hurrynow.persistence.StoreCategoryRepository;
import com.hn.hurrynow.persistence.StoreRepository;

/**
 * @author MercaYApp
 */
@Service
public class Impl implements IStub {

    @Autowired
    BranchOfficeRepository branchOfficeR;
    @Autowired
    ClientRepository clientR;
    @Autowired
    DiscountRepository discountR;
    @Autowired
    DiscountRecordRepository discountRecordR;
    @Autowired
    ProductRepository productR;
    @Autowired
    ProductCategoryRepository productCategoryR;
    @Autowired
    StoreRepository storeR;
    @Autowired
    StoreCategoryRepository storeCategoryR;

    public Impl() {

    }

    @Override
    public List<Product> getProducts() {
        return productR.findAll();
    }

    @Override
    public List<BranchOffice> getBranchOffices() {
        return branchOfficeR.findAll();
    }

    @Override
    public List<Client> getClients() {
        return clientR.findAll();
    }

    @Override
    public List<RecordDiscount> getDiscountRecords() {
        return discountRecordR.findAll();
    }

    @Override
    public List<Discount> getDiscounts() {
        return discountR.findAll();
    }

    @Override
    public List<ProductCategory> getProductCategorys() {
        return productCategoryR.findAll();
    }

    @Override
    public List<Store> getStores() {
        return storeR.findAll();
    }

    @Override
    public List<StoreCategory> getStoreCategorys() {
        return storeCategoryR.findAll();
    }

    @Override
    public BranchOffice getBranchOfficeById(Long idBranchOffice, Long idStore) {
        BranchOfficeId BOId = new BranchOfficeId(idBranchOffice, idStore);
        return branchOfficeR.findOne(BOId);
    }

    @Override
    public Client getClientById(Long id) {
        return clientR.findOne(id);
    }

    @Override
    public RecordDiscount getDiscountRecordById(Long idClient, Long idDiscount) {
        RecordDiscountId DRId = new RecordDiscountId(idClient, idDiscount);
        return discountRecordR.findOne(DRId);
    }

    @Override
    public Discount getDiscountById(Long id) {
        return discountR.findOne(id);
    }

    @Override
    public Product getProductById(Long idProduct, Long idStore) {
        ProductId idP = new ProductId(idProduct, idStore);
        return productR.findOne(idP);
    }

    @Override
    public ProductCategory getProductCategoryById(Long id) {
        return productCategoryR.findOne(id);
    }

    @Override
    public Store getStoreById(Long id) {
        return storeR.findOne(id);
    }

    @Override
    public StoreCategory getStoreCategoryById(Long id) {
        return storeCategoryR.findOne(id);
    }

    @Override
    public void postBranchOffice(BranchOffice bo) {
        branchOfficeR.save(bo);
    }

    @Override
    public void postClient(Client c) {
        clientR.save(c);
    }

    @Override
    public void postDiscountRecord(RecordDiscount dr) {
        discountRecordR.save(dr);
    }

    @Override
    public void postDiscount(Discount d) {
        discountR.save(d);
    }

    @Override
    public void postProductCategory(ProductCategory pc) {
        productCategoryR.save(pc);
    }

    @Override
    public void postStore(Store s) {
        storeR.save(s);
    }

    @Override
    public void postStoreCategory(StoreCategory s) {
        storeCategoryR.save(s);
    }
    
    @Override
    public void postProduct(Product p) {
        productR.save(p);
    }

}
