package com.kodilla.spring;

import com.kodilla.spring.portfolio.Fibonacci;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(KodillaSpringApplication.class, args);
		Fibonacci fibo = new Fibonacci();
		System.out.println(fibo.calcFibonacci(4));
	}
}
