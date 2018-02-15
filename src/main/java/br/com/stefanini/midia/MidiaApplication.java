package br.com.stefanini.midia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class MidiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MidiaApplication.class, args);
	}
}
