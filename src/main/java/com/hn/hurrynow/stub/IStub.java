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
import java.util.List;
import java.util.Set;

/**
 *
 * @author juang
 */
public interface  IStub {
    public List<BranchOffice> getBranchOffices();
    public List<Client> getClients();
    public List<RecordDiscount> getDiscountRecords();
    public List<Discount> getDiscounts();
    public List<Product> getProducts();
    public List<ProductCategory> getProductCategorys();
    public List<Store> getStores();
    public List<StoreCategory> getStoreCategorys();
    
    //public ClientApp getSupermarketByIdClientsById(String superm, Integer id);

    //public Zone getZoneById(Integer id, Integer store, Integer supermarket);
    public BranchOffice getBranchOfficeById(Long idBranchOffice, Long idStore);
    public Client getClientById(Long id);
    public RecordDiscount getDiscountRecordById(Long idClient, Long idDiscount);
    public Discount getDiscountById(Long id);
    public Product getProductById(Long idProduct, Long idStore);
    public ProductCategory getProductCategoryById(Long id);
    public Store getStoreById(Long idStore);
    public StoreCategory getStoreCategoryById(Long id);
    
    //public Set<Product> getProductListById(Long c);

    public void postBranchOffice(BranchOffice bo);
    public void postClient(Client c);
    public void postDiscountRecord(RecordDiscount dr);
    public void postDiscount(Discount d);
    public void postProduct(Product p);
    public void postProductCategory(ProductCategory pc);
    public void postStore(Store s);
    public void postStoreCategory(StoreCategory s);
    //public void postClientApp(Supermarket s, ClientApp c); 
    //public void deleteClientApp(int c);
    //public void postEmail(int id);
    //public void putProduct(Product product);


}
