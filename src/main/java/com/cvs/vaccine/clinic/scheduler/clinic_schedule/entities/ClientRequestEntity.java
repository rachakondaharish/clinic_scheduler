package com.cvs.vaccine.clinic.scheduler.clinic_schedule.entities;

import java.sql.Time;
import java.util.Date;

public class ClientRequestEntity {
	public String clinic_name;
	public String contact_full_name;
	public long phone_number_1;
	public long phone_number_2;
	public long phone_number_3;
	public String email;
	public String address_link_1;
	public String address_link_2;
	public String city;
	public int zip_code;
	public String state;
	public Date clinic_date;
	public Time clinic_start_time;
	public Time end_time;
	public int participants_between_ages_4_64;
	public int participants_aged_65_and_up;
	public String hhhse_a_voucher;
	
	
	

}
