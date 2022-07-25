package com.xworkz.hospital.dto;

import com.xworkz.hospital.constant.Gender;

//import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Data
@Getter
@Setter
public class PatientDTO  {
	
	private int id;
	private String name;
	private Gender gender;
	private long contactNo;
	private String address;
	
}
