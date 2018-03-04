package com.cvs.vaccine.clinic.scheduler.clinic_schedule.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cvs.vaccine.clinic.scheduler.clinic_schedule.entities.ClientRequestEntity;

@RestController
@RequestMapping("CVS/v1")
public class CreateClientScheduler {
	
	
	@RequestMapping(path = "Test/clinic/request")
	public void gotContract(){
		System.out.println("I am calledddd");
	}
	
	@RequestMapping(path = "Create/Clinic/Request",    method={RequestMethod.POST})
	public ClientRequestEntity  ClientRequestEntity (@RequestBody ClientRequestEntity clientRequestEntity) {
		
		//save to database 


		return clientRequestEntity;
		
	}
	
	
	

}
