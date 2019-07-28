package edu.ameier.hockey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HockeyApp {

	public static void main(String[] args) {
		SpringApplication.run(HockeyApp.class, args);
	}

//	@Bean
//	CommandLineRunner initDB(TeamRepository teamRepository) {
//		return (args) -> {
//			HockeyTeam hockeyTeam = new HockeyTeam();
//			teamRepository.save(hockeyTeam);
//		};
//	}

}
