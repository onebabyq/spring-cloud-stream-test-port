package com.example.consumer;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
	
	@Bean
	public Consumer<Tree> sink_one(){
		return tree->System.out.println("Consumer...one: "+tree.toString());
	}
	@Bean
	public Consumer<Tree> sink_two(){
		return tree->System.out.println("Consumer...two: "+tree.toString());
	}

}
