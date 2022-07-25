package com.xworkz.hospital.crud;

import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.dto.PatientDTO;

public interface Hospital
{
	public boolean createPatientDetails(PatientDTO dto);
	public void getPatientDetails();
	public String getNameById(int id);
	public boolean deletePatientByName(String name);
	public boolean deletePatientByAddress(String address);
	public long getPatientContactNoByName(String name);
	public boolean deletePatientByGender(Gender gender);
	
}



