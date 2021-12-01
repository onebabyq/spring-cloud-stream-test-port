package com.example.supplier;

import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SupplierApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupplierApplication.class, args);
	}

	@Bean
	public Supplier<Tree> source_one(){
		Tree tree = new Tree("8192eu21ue","Apple",10);
		return () -> tree;
	}
	@Bean
	public Supplier<Tree> source_two(){
		Tree tree = new Tree("123627444","Banana",5);
		return () -> tree;
	}
}
