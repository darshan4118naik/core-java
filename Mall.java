class Mall
{
String mallName;
String location;
long contactNo;
String ownerName;
public static void main(String a[])
{
Mall mall =new Mall();
mall.mallName="Lulu Mall";
mall.location="Rajajinagar";
mall.contactNo=9824754225L;
mall.ownerName="Yusup Ali";

System.out.println("Mall name is " +mall.mallName);
System.out.println("Mall located in " +mall.location);
System.out.println("Mall contactNo is " +mall.contactNo);
System.out.println("Mall owner name is " +mall.ownerName);

System.out.println("---------------------------------------------------");

Mall mallNo2=new Mall();
mallNo2.mallName="Lulu Mall";
mallNo2.location="Rajajinagar";
mallNo2.contactNo=9824754225L;
mallNo2.ownerName="Yusup Ali";


System.out.println("Mall name is " +mallNo2.mallName);
System.out.println("Mall located in " +mallNo2.location);
System.out.println("Mall contactNo is " +mallNo2.contactNo);
System.out.println("Mall owner name is " +mallNo2.ownerName);

Mall mallNo3=new Mall();
mallNo3.mallName="Orion Mall";
mallNo3.location="Malleshwaram";
mallNo3.contactNo=8657451284L;
mallNo3.ownerName="Brigade Group";

System.out.println("---------------------------------------------------");

System.out.println("Mall name is " +mallNo3.mallName);
System.out.println("Mall located in " +mallNo3.location);
System.out.println("Mall contactNo is " +mallNo3.contactNo);
System.out.println("Mall owner name is " +mallNo3.ownerName);

}

}