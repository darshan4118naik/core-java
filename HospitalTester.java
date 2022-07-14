import java.util.Scanner;
class HospitalTester
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total Patient no : ");
		int size = sc.nextInt();
		
		Hospital hs = new Hospital(size);
		for(int i=0; i<size;i++)
		{
		
		System.out.print("Enter a Patient Name : ");
		String name= sc.next();
		
		System.out.print("Enter a Patient ID : ");
		int iD = sc.nextInt();
		
		System.out.print("Enter a Patient Address : ");
		String address = sc.next();
		
		System.out.print("Enter a Patient Contact no : ");
		long contactNo = sc.nextLong();
				
		PatientDTO dto1 = new PatientDTO();
		dto1.setID(iD);
		dto1.setName(name);
		//dto1.setGender(Gender.male);
		dto1.setAddress(address);
		dto1.setContactNo(contactNo);
		hs.createPatient(dto1);
				
       }
	   hs.getPetientDetails();
	   
	   System.out.print("Enter the existing Id for update Patient Address : ");
	   int existingId = sc.nextInt();
	   System.out.print("Enter the updated Patient Address : ");
	   String updateAddress=sc.next();
	   hs.updatePatientAddressById(existingId , updateAddress);
	   hs.getPetientDetails();
	   
	   System.out.print("Enter the existing name for delete patient: ");
	   String existingName = sc.next();
	   hs.deletePatientByName(existingName);
	   hs.getPetientDetails();
	   
	    System.out.print("Enter the existing Address for delete patient: ");
	   String existingAdd = sc.next();
	  hs.deletePatientByAddress(existingAdd);
	   hs.getPetientDetails();
    }
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*	PatientDTO dto = new PatientDTO();
		dto.setID(iD);
		dto.setName(name);
		//dto.setGender(Gender.male);
		dto.setAddress(address);
		dto.setContactNo(contactNo);
		
		
		
		
		hs.createPatient(dto);
		//
		
	}
}
/*
		PatientDTO dto2 = new PatientDTO();
		dto2.setID(123);
		dto2.setName("Bolu");
		dto2.setGender(Gender.male);
		dto2.setAddress("Bhatkal");
		dto2.setContactNo(8867696331L);
		hs.createPatient(dto2);  
		
		hs.createPatient(dto);
		
		hs.createPatient(dto2);
		*/