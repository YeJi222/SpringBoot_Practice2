package studio.thinkground.AroundHubSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class AroundHubSpringBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(AroundHubSpringBootApplication.class, args);
	}
}
