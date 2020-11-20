package com.esprit.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CandidatMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CandidatMsApplication.class, args);
	}

	@Autowired
	private CandidatRepository repository;

	@Bean
	ApplicationRunner init() {
		return (args) -> {
			// save
			repository.save(new Candidat("mariem", "ch", "ma@esprit.tn"));
			repository.save(new Candidat("sarra", "ab", "sa@esprit.tn"));
			repository.save(new Candidat("mohamed", "ba", "mo@esprit.tn"));
			// fetch
			repository.findAll().forEach(System.out::println);
		};
	}

}
