package com.itb.inf2fm.pizzariacorinthians;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzariacorinthiansApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzariacorinthiansApplication.class, args);
		System.out.println("Servidor rodando na porta 8080");
	}

}
