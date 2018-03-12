package com.cvs.vaccine.clinic.scheduler.clinic_schedule.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cvs.vaccine.clinic.scheduler.clinic_schedule.entities.ClientRequestEntity;
import com.cvs.vaccine.clinic.scheduler.clinic_schedule.entities.StoreEntity;

@Service
public interface StoreRepository extends JpaRepository<StoreEntity, String> {

	
}
