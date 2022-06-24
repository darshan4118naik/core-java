class FaceWash
{
String brand;
int price;
public static void main(String a[])
{
FaceWash faceWash = new FaceWash("Dove" , 300);
System.out.println ("FaceWash Brand Name : " +faceWash.brand);
System.out.println ("FaceWash price : " +faceWash.price);
}
public FaceWash(String brand,int price)
{
	this();
this.brand=brand;
this.price=price;
}
public FaceWash()
{
	System.out.println("Dummy Constructor created");
}
}