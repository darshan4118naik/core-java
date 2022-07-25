
package com.xworkz.hospital;



import java.util.Scanner;

import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.crud.Hospital;
import com.xworkz.hospital.crud.impl.HospitalImpl;
import com.xworkz.hospital.dto.PatientDTO;



public class HospitalTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter no of patient : ");
			int size = sc.nextInt();
			Hospital ht = new HospitalImpl(size);
			for (int i = 0; i < size; i++) {

				System.out.print("Enter ID : ");
				int id = sc.nextInt();
				System.out.print("Enter Name : ");
				String name = sc.next();
				System.out.print("Enter Gender : ");
				String gender = sc.next();
				System.out.print("Enter ContactNo : ");
				long contactNo = sc.nextLong();
				System.out.print("Enter Address : ");
				String address = sc.next();
				// sc.close();

				PatientDTO dto = new PatientDTO();
				dto.setAddress(address);
				dto.setId(id);
				dto.setName(name);
				dto.setContactNo(contactNo);
				dto.setGender(Gender.valueOf(gender));
				ht.createPatientDetails(dto);
			}
			String option = null;

			do {
				System.out.println("Enter 1 to get all Patient details : ");
				System.out.println("Enter 2 to get Name By Id : ");
				System.out.println("Enter 3 to  delete Patient By Name");
				System.out.println("Enter 4 to delete Patient By Address");
				System.out.println("Enter 5 to get Patient ContactNo ByName");
				System.out.println("Enter 6 to delete Patient By Gender");

				System.out.println("Enter the Choise : ");
				int choise = sc.nextInt();

				switch (choise) {
				case 1:
					ht.getPatientDetails();
					break;

				case 2:
					System.out.print(" Enter existing ID for Name : ");
					int existingId = sc.nextInt();
					ht.getNameById(existingId);
					break;

				case 3:
					System.out.print("Enter name to delete Patient : ");
					String existingName = sc.next();
					ht.deletePatientByName(existingName);
					break;

				case 4:
					System.out.print("Enter Address to delete Patient : ");
					String existingAddress = sc.next();
					ht.deletePatientByAddress(existingAddress);
					break;

				case 5:
					System.out.print("Enter Name to get Patient contact no : ");
					String existingName1 = sc.next();
					ht.getPatientContactNoByName(existingName1);
					break;

				case 6:
					System.out.print("Enter Gender to delete Patient : ");
					String existingGender = sc.next();
					ht.deletePatientByGender(Gender.valueOf(existingGender));
					break;

				default:
					System.out.println("Wrong option please select vallid one : ");
					break;
				}
				System.out.print("Do you want to continue Y/N : ");
				option = sc.next();
				

			} while (option.equals("Y"));
			sc.close();
		}
		
	}

