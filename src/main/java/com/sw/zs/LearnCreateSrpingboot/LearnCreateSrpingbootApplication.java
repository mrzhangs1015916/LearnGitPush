package com.sw.zs.LearnCreateSrpingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {"com.sw.zs.Bean"})
public class LearnCreateSrpingbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnCreateSrpingbootApplication.class, args);
	}
}
