package com.sivagroups.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sivagroups.ems.entity.Products;
import com.sivagroups.ems.repository.ProductsRepository;

@SpringBootApplication
public class RajanenterprisesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RajanenterprisesApplication.class, args);
	}

	@Autowired
	private ProductsRepository productsRepository;

	@Override
	public void run(String... args) throws Exception {
		Products p1=new Products("Horlicks 1kg","kg",120.0);
        productsRepository.save(p1);
		Products p2=new Products("Horlicks 2kg","kg",210.0);
		productsRepository.save(p2);
	}

}
