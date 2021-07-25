package com.dio.id_control;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dio.id_control.entities.Occurrence;


@SpringBootApplication
public class IdControlApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(IdControlApplication.class, args);
		
		
	
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Occurrence o = new Occurrence(1L,"datadsggeg");
		
	}

}
