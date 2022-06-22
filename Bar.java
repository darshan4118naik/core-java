class Bar
{
String barName;
String location;
long contactNo;
String ownerName;
public static void main(String a[])
{
Bar bar =new Bar();
bar.barName="GD Bar";
bar.location="Rajajinagar";
bar.contactNo=9824754225L;
bar.ownerName="Gurudeep";

System.out.println("Bar owner name is " +bar.barName + " Bar located in " +bar.location + " Bar contactNo is " +bar.contactNo + " Bar owner name is " +bar.ownerName);
System.out.println("---------------------------------------------------");

Bar barNo2=new Bar();
barNo2.barName="Pipe 11 Bar";
barNo2.location="Rajajinagar";
barNo2.contactNo=9824754225L;
barNo2.ownerName="Danish";


System.out.println("Bar owner name is " +barNo2.barName + " Bar located in " +barNo2.location + " Bar contactNo is " +barNo2.contactNo + " Bar owner name is " +barNo2.ownerName);
System.out.println("---------------------------------------------------");

Bar barNo3=new Bar();
barNo3.barName="Navaranga Bar";
barNo3.location="Rajajinagar";
barNo3.contactNo=9625846235L;
barNo3.ownerName="Nagendra";

System.out.println("Bar owner name is " +barNo3.barName + " Bar located in " +barNo3.location + " Bar contactNo is " +barNo3.contactNo + " Bar owner name is " +barNo3.ownerName);
System.out.println("---------------------------------------------------");

Bar barNo4=new Bar();
barNo4.barName="Ganotri Bar";
barNo4.location="RTnagar";
barNo4.contactNo=9625846235L;
barNo4.ownerName="Sujaj";

System.out.println("Bar owner name is " +barNo4.barName + " Bar located in " +barNo4.location + " Bar contactNo is " +barNo4.contactNo + " Bar owner name is " +barNo4.ownerName);
}

}
