package com.cvs.vaccine.clinic.scheduler.clinic_schedule.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cvs.vaccine.clinic.scheduler.clinic_schedule.entities.ClientRequestEntity;
import com.cvs.vaccine.clinic.scheduler.clinic_schedule.services.CreateClinicService;
import com.cvs.vaccine.clinic.scheduler.clinic_schedule.valueObjects.CreateClinicRequestVO;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("CVS/v1")
public class StoreController {
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
	
	@RequestMapping(path = "Create/Clinic/Request/{createClinicRequestVO}",    method={RequestMethod.GET})
	public CreateClinicRequestVO  ClientRequestEntity1(@PathVariable String createClinicRequestVO) throws JsonParseException, JsonMappingException, IOException {
		System.out.println(createClinicRequestVO);
		ObjectMapper mapper = new ObjectMapper();
		CreateClinicRequestVO obj = mapper.readValue(createClinicRequestVO, CreateClinicRequestVO.class);
		//CreateClinicRequestVO
		//createClinicService.saveClinic(createClinicRequestVO);


		return null;
		
	}
	
	
	

}
