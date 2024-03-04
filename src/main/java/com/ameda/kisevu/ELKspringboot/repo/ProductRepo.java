package com.ameda.kisevu.ELKspringboot.repo;/*
*
@author ameda
@project ELK-springboot
*
*/

import com.ameda.kisevu.ELKspringboot.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepo extends ElasticsearchRepository<Product,Integer> {
}
