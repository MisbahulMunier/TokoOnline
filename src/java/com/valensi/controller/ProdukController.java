/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.controller;

import com.valensi.dao.ProdukService;
import com.valensi.model.Produk;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Misbahul Munir
 */

@Controller
@RequestMapping("/produk")
public class ProdukController {
    @Autowired
    ProdukService cs;
    
    List<Produk> keranjang = new ArrayList<>();
    
    @RequestMapping("/all")
    public String showAllProduct(HttpSession session){
    List<Produk> product=cs.findAllCustomer();
    session.setAttribute("produk",product);
    session.setAttribute("keranjang",keranjang);
    return "produk";
    }
    
    @RequestMapping(value ="/{id}")
    public String showOneCustomer(@PathVariable Integer id, HttpSession session){
        Produk customer= cs.finById(id);
        session.setAttribute("produk", customer);
        return "produkdetail";
    }
    
    @RequestMapping("/addCarts")
    public String addToCarts(HttpSession session){
    List<Produk> barang= (List<Produk>) session.getAttribute("keranjang");
    barang.add((Produk) session.getAttribute("produk"));
    session.removeAttribute("produk");
    return "keranjang";
    }
}
