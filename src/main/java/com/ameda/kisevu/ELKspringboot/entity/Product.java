package com.ameda.kisevu.ELKspringboot.entity;/*
*
@author ameda
@project ELK-springboot
*
*/

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(indexName = "products")
public class Product {
    private int id;

    private String name;
    private String description;
    private int quantity;
    private double price;
}
