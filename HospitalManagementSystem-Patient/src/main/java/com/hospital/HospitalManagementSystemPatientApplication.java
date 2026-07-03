package com.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HospitalManagementSystemPatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementSystemPatientApplication.class, args);
	}

}
