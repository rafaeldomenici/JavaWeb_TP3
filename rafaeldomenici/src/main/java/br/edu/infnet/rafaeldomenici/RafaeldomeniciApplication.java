package br.edu.infnet.rafaeldomenici;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;




@SpringBootApplication
@EnableFeignClients

public class RafaeldomeniciApplication {

	public static void main(String[] args) {
		SpringApplication.run(RafaeldomeniciApplication.class, args);
	}

}
