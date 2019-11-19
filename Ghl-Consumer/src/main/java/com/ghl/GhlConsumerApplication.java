package com.ghl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath*:rpc/rpc-ghlprovider-client.xml" })
@SpringBootApplication
public class GhlConsumerApplication {
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(GhlConsumerApplication.class);
		ApplicationContext applicationContext = springApplication.run(args);

//		HelloSyncService helloSyncServiceReference = (HelloSyncService) applicationContext
//				.getBean("helloSyncServiceReference");
//
//		System.out.println("ghlghgh"+helloSyncServiceReference.saySync("喜洋洋"));
	}
}
