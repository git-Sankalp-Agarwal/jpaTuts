package com.learnsbt.jpaTutorial.jpaTuts.controllers;

import com.learnsbt.jpaTutorial.jpaTuts.Entities.ProductEntity;
import com.learnsbt.jpaTutorial.jpaTuts.repostiories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/productDs")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping
    public List<ProductEntity> getProductEntityList(@RequestParam(defaultValue = "id") String sortBy) {
        return productRepository.findBy(Sort.by(Sort.Direction.DESC, sortBy,"price"));
    }



}
