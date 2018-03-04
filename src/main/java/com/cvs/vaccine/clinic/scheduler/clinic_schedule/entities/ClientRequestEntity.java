package com.cvs.vaccine.clinic.scheduler.clinic_schedule.entities;

import java.sql.Time;
import java.util.Date;

//@Table
//@Entity
public class ClientRequestEntity {
	
//	@Id
//	@GeneratedValue
	private Long id;
	
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
	public String use_a_voucher;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClinic_name() {
		return clinic_name;
	}
	public void setClinic_name(String clinic_name) {
		this.clinic_name = clinic_name;
	}
	public String getContact_full_name() {
		return contact_full_name;
	}
	public void setContact_full_name(String contact_full_name) {
		this.contact_full_name = contact_full_name;
	}
	public long getPhone_number_1() {
		return phone_number_1;
	}
	public void setPhone_number_1(long phone_number_1) {
		this.phone_number_1 = phone_number_1;
	}
	public long getPhone_number_2() {
		return phone_number_2;
	}
	public void setPhone_number_2(long phone_number_2) {
		this.phone_number_2 = phone_number_2;
	}
	public long getPhone_number_3() {
		return phone_number_3;
	}
	public void setPhone_number_3(long phone_number_3) {
		this.phone_number_3 = phone_number_3;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress_link_1() {
		return address_link_1;
	}
	public void setAddress_link_1(String address_link_1) {
		this.address_link_1 = address_link_1;
	}
	public String getAddress_link_2() {
		return address_link_2;
	}
	public void setAddress_link_2(String address_link_2) {
		this.address_link_2 = address_link_2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip_code() {
		return zip_code;
	}
	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getClinic_date() {
		return clinic_date;
	}
	public void setClinic_date(Date clinic_date) {
		this.clinic_date = clinic_date;
	}
	public Time getClinic_start_time() {
		return clinic_start_time;
	}
	public void setClinic_start_time(Time clinic_start_time) {
		this.clinic_start_time = clinic_start_time;
	}
	public Time getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Time end_time) {
		this.end_time = end_time;
	}
	public int getParticipants_between_ages_4_64() {
		return participants_between_ages_4_64;
	}
	public void setParticipants_between_ages_4_64(int participants_between_ages_4_64) {
		this.participants_between_ages_4_64 = participants_between_ages_4_64;
	}
	public int getParticipants_aged_65_and_up() {
		return participants_aged_65_and_up;
	}
	public void setParticipants_aged_65_and_up(int participants_aged_65_and_up) {
		this.participants_aged_65_and_up = participants_aged_65_and_up;
	}
	public String getUse_a_voucher() {
		return use_a_voucher;
	}
	public void setUse_a_voucher(String use_a_voucher) {
		this.use_a_voucher = use_a_voucher;
	}

	
	
	
	

}
