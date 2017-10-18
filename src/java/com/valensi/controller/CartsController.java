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
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/keranjangbelanja")
public class CartsController {
    @Autowired
    ProdukService service;
    
    @RequestMapping()
    public String keranjang(HttpSession session, Model model){
    List<Produk> listProd=(List<Produk>) session.getAttribute("keranjang");
    List<Produk> products=new ArrayList<>();
        for (Produk product : listProd) {
            products.add(service.finById(product.getId()));
        }
        model.addAttribute("produk",products);
        
        return "keranjangbelanja";
    }
}
