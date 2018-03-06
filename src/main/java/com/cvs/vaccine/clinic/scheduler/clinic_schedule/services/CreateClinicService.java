package com.cvs.vaccine.clinic.scheduler.clinic_schedule.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvs.vaccine.clinic.scheduler.clinic_schedule.entities.ClientRequestEntity;
import com.cvs.vaccine.clinic.scheduler.clinic_schedule.entities.EmployerDetailsEntity;
import com.cvs.vaccine.clinic.scheduler.clinic_schedule.jpa.ClientRequestRepository;
import com.cvs.vaccine.clinic.scheduler.clinic_schedule.jpa.EmployerDetailsRepository;
import com.cvs.vaccine.clinic.scheduler.clinic_schedule.valueObjects.CreateClinicRequestVO;

@Service
public class CreateClinicService {
	
	@Autowired
	ClientRequestRepository clientRequestRepository;
	@Autowired
	EmployerDetailsRepository employerDetailsRepository;
	
	public void saveClinic(CreateClinicRequestVO createClinicRequestVO){
		EmployerDetailsEntity employerDetailsEntity = employerDetailsRepository.findOneByuserId(createClinicRequestVO.getUserId());	
		
		ClientRequestEntity clientRequestEntity = new ClientRequestEntity();
		clientRequestEntity.setUserType(employerDetailsEntity.getUserType());
		clientRequestEntity.setAddress_link_1(createClinicRequestVO.getAddress_link_1());
		clientRequestEntity.setAddress_link_2(createClinicRequestVO.getAddress_link_2());
		clientRequestEntity.setCity(createClinicRequestVO.getCity());
		clientRequestEntity.setClinic_date(createClinicRequestVO.getClinic_date());
		clientRequestEntity.setClinic_start_time(createClinicRequestVO.getClinic_start_time());
		clientRequestEntity.setContact_full_name(createClinicRequestVO.getContact_full_name());
		clientRequestEntity.setEmail(createClinicRequestVO.getEmail());
		clientRequestEntity.setEnd_time(createClinicRequestVO.getEnd_time());
		clientRequestEntity.setParticipants_aged_65_and_up(createClinicRequestVO.getParticipants_aged_65_and_up());
		clientRequestEntity.setParticipants_between_ages_4_64(createClinicRequestVO.getParticipants_between_ages_4_64());
		clientRequestEntity.setPhone_number_1(createClinicRequestVO.getPhone_number_1());
		clientRequestEntity.setPhone_number_2(createClinicRequestVO.getPhone_number_2());
		clientRequestEntity.setPhone_number_3(createClinicRequestVO.getPhone_number_3());
		clientRequestEntity.setState(createClinicRequestVO.getState());
		clientRequestEntity.setUse_a_voucher(createClinicRequestVO.getUse_a_voucher());
		clientRequestEntity.setZip_code(createClinicRequestVO.getZip_code());
		clientRequestRepository.saveAndFlush(clientRequestEntity);
		
	}
}
