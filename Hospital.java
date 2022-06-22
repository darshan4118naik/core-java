class Hospital{
 String name;
 String address;
 long contactNo;
 String ownerName;
  
public static void main(String a[]){
Hospital hospital = new Hospital();
hospital.name = "Ayu Multi Speciality Hospital";
hospital.address = "Bellandur Bangalore";
hospital.contactNo = 9859863651L;
hospital.ownerName = "Karan Gupta";

System.out.println("Name " +hospital.name);
System.out.println("Address "+hospital.address);
System.out.println("Conact no " +hospital.contactNo);
System.out.println("Owner" +hospital.ownerName);
System.out.println("---------------------------------------");

Hospital hospital1 = new Hospital();
hospital1.name = "Fortis";
hospital1.address = "Rajajinagar";
hospital1.contactNo = 8456987851L;
hospital1.ownerName = "IHH health care";

System.out.println("Name " +hospital.name);
System.out.println("Address " +hospital.address);
System.out.println("Conact no "+hospital.contactNo);
System.out.println("Owner " +hospital.ownerName);

Hospital hospital2 = new Hospital();
hospital2.name = "HCG Cancer Centre";
hospital2.address = "Ashoknagar";
hospital2.contactNo = 9824812441L;
hospital2.ownerName = "Dr Bs Ajaikumar";

System.out.println("---------------------------------------");
System.out.println("Name " +hospital2.name);
System.out.println("Address " +hospital2.address);
System.out.println("Conact no "+hospital2.contactNo);
System.out.println("Owner " +hospital2.ownerName);



}


}