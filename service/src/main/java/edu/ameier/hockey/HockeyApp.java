package com.example.helloworld;

import com.example.helloworld.Repositories.TeamRepository;
import com.example.helloworld.models.HockeyTeam;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HockeyApp {

	public static void main(String[] args) {
		SpringApplication.run(HockeyApp.class, args);
	}

	@Bean
	CommandLineRunner initDB(TeamRepository teamRepository) {
		return (args) -> {
			HockeyTeam hockeyTeam = new HockeyTeam();
			teamRepository.save(hockeyTeam);
		};
	}

}
