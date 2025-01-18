package com.learnsbt.jpaTutorial.jpaTuts;

import com.learnsbt.jpaTutorial.jpaTuts.Entities.ProductEntity;
import com.learnsbt.jpaTutorial.jpaTuts.repostiories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class JpaTutorialApplicationTests {

//	@Autowired
//	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	void getPrice(){
//		List<ProductEntity> productList = productRepository.findByPriceBetween(BigDecimal.valueOf(12),
//				BigDecimal.valueOf(15));
//
//		System.out.println(productList);
//
//	}
}
