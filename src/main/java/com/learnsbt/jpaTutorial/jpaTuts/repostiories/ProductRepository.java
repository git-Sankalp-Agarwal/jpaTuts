package com.learnsbt.jpaTutorial.jpaTuts.repostiories;

import com.learnsbt.jpaTutorial.jpaTuts.Entities.ProductEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity> findByPriceBetween (BigDecimal price1, BigDecimal price2);

    List<ProductEntity> findAllByOrderByPriceDesc();

    List<ProductEntity> findBy(Sort sort);



}
