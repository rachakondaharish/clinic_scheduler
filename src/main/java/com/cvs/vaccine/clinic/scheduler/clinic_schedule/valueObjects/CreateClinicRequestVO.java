package com.cvs.vaccine.clinic.scheduler.clinic_schedule.valueObjects;

import com.cvs.vaccine.clinic.scheduler.clinic_schedule.entities.ClientRequestEntity;

public class CreateClinicRequestVO extends ClientRequestEntity{
	
	public int userId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
