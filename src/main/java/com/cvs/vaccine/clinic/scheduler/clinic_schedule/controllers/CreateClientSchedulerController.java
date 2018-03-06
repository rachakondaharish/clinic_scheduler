package com.cvs.vaccine.clinic.scheduler.clinic_schedule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cvs.vaccine.clinic.scheduler.clinic_schedule.entities.ClientRequestEntity;
import com.cvs.vaccine.clinic.scheduler.clinic_schedule.services.CreateClinicService;
import com.cvs.vaccine.clinic.scheduler.clinic_schedule.valueObjects.CreateClinicRequestVO;

@RestController
@RequestMapping("CVS/v1")
public class CreateClientSchedulerController {
	@Autowired
	CreateClinicService createClinicService;
	
	@RequestMapping(path = "Test/clinic/request")
	public void gotContract(){
		System.out.println("I am calledddd");
	}
	
	@RequestMapping(path = "Create/Clinic/Request",    method={RequestMethod.POST})
	public CreateClinicRequestVO  ClientRequestEntity (@RequestBody CreateClinicRequestVO createClinicRequestVO) {
		
		
		createClinicService.saveClinic(createClinicRequestVO);


		return createClinicRequestVO;
		
	}
	
	
	

}
