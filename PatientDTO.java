public class PatientDTO
{	
	private int iD;
	private String name;
	private Gender gender;
	private long contactNo;
	private String address;
	
	@Override
	public int hashCode()
	{		return this.iD;
	}
	
	public PatientDTO()
	{
		System.out.println("patientDTO constructor created");
	}	
	public int getID()
	{
		return iD;
	}
	
	public void setID(int iD)
	{
		this.iD=iD;
	}
	
	public String getName()
	{
		return name;
	}	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public Gender getGender()
	{
		return gender;
	}
	
	public void setGender(Gender gender)
	{
		this.gender = gender;
	}	
	public long getContactNo()
	{
		return contactNo;
	}	
	public void setContactNo(long contactNo)
	{
		this.contactNo=contactNo;
	}	
	public String getAddress()
	{
		return address;
	}	
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String toString()
	{
		return "[PatientDTO : Id="+this.iD+" , Name="+this.name+" ,Gender="+this.gender+" ,Address="+this.address+" , ContactNo="+this.contactNo+"]";
	}
}



