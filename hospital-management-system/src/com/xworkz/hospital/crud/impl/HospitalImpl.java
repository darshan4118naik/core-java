package com.xworkz.hospital.crud.impl;

import java.util.Arrays;

import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.crud.Hospital;
import com.xworkz.hospital.dto.PatientDTO;

public class HospitalImpl implements Hospital {

	PatientDTO[] dtos;
	int index;

	public HospitalImpl(int size) {

		dtos = new PatientDTO[size];
	}

	public boolean createPatientDetails(PatientDTO dto) {
		boolean isAdded = false;
		//for (int i = 0; i < dtos.length; i++) {
			if (dto != null) {
				this.dtos[index++] = dto;
				isAdded = true;
				System.out.println("Created succussfully");
			} else {
				System.out.println("Error");
			}

		
		return isAdded;

	}

	public void getPatientDetails() {

		for (int i = 0; i < dtos.length; i++) {
			System.out.println(dtos[i]);

		}
	}

	public String getNameById(int id) {
		String names = null;
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i].getId() == id) {
				names = dtos[i].getName();
				System.out.println(dtos[i].getName());

			} else {

			}
		}
		return names;

	}

	public boolean deletePatientByName(String name) {
		boolean deletePatient = false;
		int i, j;
		for (i = 0, j = 0; i < dtos.length; i++) {
			if (!dtos[j].getName().equals(name)) {
				dtos[i++] = dtos[j];
				deletePatient = true;
				System.out.println("Deleted successfully");
			}

		}
		dtos = Arrays.copyOf(dtos, j);
		return deletePatient;

	}

	public boolean deletePatientByAddress(String address) {
		boolean deletePatient1 = false;
		int i, j;
		for (i = 0, j = 0; j < dtos.length; j++) {
			if (!dtos[j].getAddress().equals(address)) {
				dtos[i++] = dtos[j];
				deletePatient1 = true;
				System.out.println("Deleted successfully");
			}

		}
		dtos = Arrays.copyOf(dtos, i);
		return deletePatient1;
	}

	public long getPatientContactNoByName(String name) {
		long patientContNo = 0;
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i].getName().equals(name)) {
				patientContNo = dtos[i].getContactNo();
				System.out.println(dtos[i].getContactNo());
			} else {
				System.out.println("name not matched");
			}
		}
		return patientContNo;
	}

	public boolean deletePatientByGender(Gender gender) {
		int i, j = 0;
		boolean deletePatient = false;
		for (i = 0, j = 0; i < dtos.length; i++) {
			if (!dtos[i].getGender().toString().equals(gender)) {
				dtos[i++] = dtos[j];
				deletePatient = true;
				System.out.println("Deleted");

			} else {
				System.out.println("Gender not matching");
			}

		}
		dtos = Arrays.copyOf(dtos, i);
		return deletePatient;
	}}