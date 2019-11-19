package com.ghl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath*:rpc/rpc-server.xml" })
@SpringBootApplication
public class GhlProviderApplication {
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(GhlProviderApplication.class);
		ApplicationContext applicationContext = springApplication.run(args);
	}
}
