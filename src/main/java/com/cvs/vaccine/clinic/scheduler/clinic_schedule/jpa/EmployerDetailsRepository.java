package com.cvs.vaccine.clinic.scheduler.clinic_schedule.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.cvs.vaccine.clinic.scheduler.clinic_schedule.entities.EmployerDetailsEntity;

@Service
public interface EmployerDetailsRepository extends JpaRepository<EmployerDetailsEntity, String>{

	public EmployerDetailsEntity findOneByuserId(int userId);
}
