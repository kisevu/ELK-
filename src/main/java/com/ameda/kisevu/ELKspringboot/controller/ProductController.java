package com.ameda.kisevu.ELKspringboot.controller;/*
*
@author ameda
@project ELK-springboot
*
*/

import com.ameda.kisevu.ELKspringboot.entity.Product;
import com.ameda.kisevu.ELKspringboot.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/findAll")
    public Iterable<Product> findAllProducts(){
        return productService.getProducts();
    }
    @PostMapping("/insert")
    public Product insertProduct(@RequestBody Product product){
       return  productService.insertProduct(product);
    }
}
