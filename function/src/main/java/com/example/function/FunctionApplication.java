package com.example.function;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FunctionApplication.class, args);
	}
	
	@Bean
	public Function<Tree,Tree> process_one(){
		return tree -> {
			tree.setName(tree.getName().concat(" Type 1"));
			System.out.println("Processing: "+tree.toString());
			return tree;
		};
	}
	@Bean
	public Function<Tree,Tree> process_two(){
		return tree -> {
			tree.setName(tree.getName().concat(" Type 2"));
			System.out.println("Processing: "+tree.toString());
			return tree;
		};
	}
	@Bean
	public Function<Tree,Tree> process_three(){
		return tree -> {
			tree.setName(tree.getName().concat(" Type 3"));
			System.out.println("Processing: "+tree.toString());
			return tree;
		};
	}
}
