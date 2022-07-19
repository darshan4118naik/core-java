import java.util.Arrays;
class HospitalImpl implements Hospital2{
     // has a relation---one to many
    PatientDTO[] dtos ;
	//instace variable
	int index;
	
	public HospitalImpl(int size)
	{
	  dtos	= new PatientDTO[size];
	System.out.println("Hospital object created");
	}
	
	@Override
	public boolean createPatient(PatientDTO dto)
	{
		System.out.println("inside create patient");
		boolean isAdded = false;
		if(dto!=null && dto.getId()!=0){
			this.dtos[index++]=dto;
		    isAdded=true;
			System.out.println("patient details added successfully");
		}
		else
		{
			System.out.println("Add it correctly");
		}
		return isAdded;
	}
	
	@Override
	public void getPatientDetails()
	{
		System.out.println("details of all patient");
		
		for(int i =0 ; i<dtos.length ; i++)
		{
			System.out.println(dtos[i].getId()+": "+dtos[i].getName()+" :"+dtos[i].getAddress()+":"+/*" "+dtos[i].getGender()+" "+*/dtos[i].getContactNo());
		}
	}
	
	@Override
	public boolean updatePatientAddressById(int id,String address)
	{
		System.out.println("inside updatePatientAddressById");
		   boolean updatedAddress=false;
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getId()==id){
				dtos[i].setAddress(address);
				updatedAddress=true;
				System.out.println("updated successfully");
			}
			else
			{
				System.out.println("not updated");
			}
		}
		return updatedAddress;
	}
	
	@Override
	public boolean deletePatientByName(String name)
	{
		boolean patientDeleted=false;
		int i,j;
		for(i=0,j=0;j<dtos.length;j++){
			if(!dtos[j].getName().equals(name)){
				dtos[i++]=dtos[j];
				patientDeleted=true;
			
				System.out.println("deleted");
			}		
		}
		dtos=Arrays.copyOf(dtos,i);
		return patientDeleted;
	}
	
	@Override
	public String getPatientNameById(int id){
	 String names=null;
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getId()==id){
				names=dtos[i].getName();
				System.out.println(/*dtos[i].getId()+": "+*/dtos[i].getName()/*+" :"+dtos[i].getAddress()+":"+" "+dtos[i].getGender()+" "+dtos[i].getContactNo()*/);
			}
			else{
				System.out.println("not found");
			}
		}
		return names;
	}
	
	@Override
	public long getPatientContactNoByName(String name){
		long patientContNo = 0;
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getName().equals(name)){
				patientContNo=dtos[i].getContactNo();
				System.out.println(dtos[i].getContactNo());
			}
			else{
				System.out.println("name not matched");
			}
		}
		return patientContNo;
	}
	
	@Override
	public boolean deletePatientByAddress(String address)
	{ 
		boolean deletePatient1=false;
		int i , j;
		for( i=0,j=0;j<dtos.length;j++)
		{
			if(!dtos[j].getAddress().equals(address))
			{				
				dtos[i++]=dtos[j];
				deletePatient1=true;
				System.out.println("Deleted successfully");				
			}
         						
		}
		dtos=Arrays.copyOf(dtos,j);
		return deletePatient1;
	}
	
	@Override
	public boolean deletePatientByGender(Gender gender)
	{ 
		boolean deletePatientG=false;
		int i , j;
		for( i=0,j=0;j<dtos.length;j++)
		{
			if(!dtos[j].getGender().equals(gender))
			{				
				dtos[i++]=dtos[j];
				deletePatientG=true;
				System.out.println("Deleted successfully");				
			}
         						
		}
		dtos=Arrays.copyOf(dtos,j);
		return deletePatientG;
	}
}