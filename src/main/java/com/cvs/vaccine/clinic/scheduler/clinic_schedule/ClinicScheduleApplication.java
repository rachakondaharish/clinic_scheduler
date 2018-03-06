package com.cvs.vaccine.clinic.scheduler.clinic_schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = { "com.cvs.vaccine.clinic" })
public class ClinicScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicScheduleApplication.class, args);
	}
}
