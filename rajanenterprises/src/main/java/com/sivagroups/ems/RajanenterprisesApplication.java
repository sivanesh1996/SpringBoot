package com.sivagroups.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sivagroups.ems.entity.Products;
import com.sivagroups.ems.repository.ProductsRepository;

@SpringBootApplication
public class RajanenterprisesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RajanenterprisesApplication.class, args);
	}


}
