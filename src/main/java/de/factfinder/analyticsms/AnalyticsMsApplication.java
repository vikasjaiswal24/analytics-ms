package de.factfinder.analyticsms;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
@EnableScheduling
public class AnalyticsMsApplication {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	String home() {
		return "Hey Welcome to the world of Microservices!!!!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(AnalyticsMsApplication.class, args);
	}

}
