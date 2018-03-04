package com.cvs.vaccine.clinic.scheduler.clinic_schedule.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CreateClientScheduler.CONTRACT_BASE_URI)
public class CreateClientScheduler {
	
	public static final String CONTRACT_BASE_URI = "CVS/v1/create";
	
	@RequestMapping(value = "/clinic/request")
	public void gotContract(){
		System.out.println("I am calledddd");
	}

}
