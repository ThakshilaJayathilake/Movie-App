package dev.tnj.moviestnj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MoviestnjApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviestnjApplication.class, args);
	}

}
