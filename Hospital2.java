
interface Hospital2 {
	
	public boolean createPatient(PatientDTO dto);
	public void getPatientDetails();
	public boolean updatePatientAddressById(int id,String address);
	public boolean deletePatientByName(String name);
	public String getPatientNameById(int id);
	public long getPatientContactNoByName(String name);
	public boolean deletePatientByAddress(String address);
public boolean deletePatientByGender(Gender gender);
	
	
}