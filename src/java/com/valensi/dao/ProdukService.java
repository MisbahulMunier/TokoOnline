/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.dao;

import com.valensi.model.Produk;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Misbahul Munir
 */
@Repository
@Transactional
public class ProdukService {

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }
    @PersistenceContext
    private EntityManager em;
    
    @Transactional
    public void register(Produk cus){
        this.em.persist(cus);
    }
    
    public List<Produk> findAllCustomer(){
        List<Produk> customers = em.createNamedQuery("Produk.findAll").getResultList();
        return customers;
    }
    
    public Produk finById(Integer customerId){
        return em.find(Produk.class, customerId);
    }
}
