package com.ameda.kisevu.ELKspringboot.service;/*
*
@author ameda
@project ELK-springboot
*
*/

import com.ameda.kisevu.ELKspringboot.entity.Product;
import com.ameda.kisevu.ELKspringboot.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;
    
    
    public Iterable<Product> getProducts(){
        return productRepo.findAll();
    }

    public Product insertProduct(Product product){
        return productRepo.save(product);
    }

    public Product updateProduct(int id,Product product){
        Product found = productRepo.findById(id).orElseThrow();
        found.setPrice(product.getPrice());
        found.setQuantity(product.getQuantity());
        return productRepo.save(found);
    }

    public void deleteProduct(int id){
        productRepo.deleteById(id);
    }
}
