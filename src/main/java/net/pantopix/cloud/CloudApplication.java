package net.pantopix.cloud;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class CloudApplication {

	@Bean
	public CommandLineRunner CommandLineRunner() {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("Hello World");
			}
		};
	}

	public static void main(String[] args) {

		SpringApplication.run(CloudApplication.class, args);
	}


}
