package com.br.cielo.apireunioes;

import com.br.cielo.apireunioes.repository.ApiReunioesRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ApireunioesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApireunioesApplication.class, args);
	}

}
