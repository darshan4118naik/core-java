class Sandal
{
String brand;
String color;
int price;
public static void main(String a[])
{
Sandal Sandal = new Sandal("Decathlon" , "Black" ,2000);
System.out.println ("Sandal Brand Name : " +Sandal.brand);
System.out.println ("Sandal color  : " +Sandal.color);
System.out.println ("Sandal price : " +Sandal.price);
}
public Sandal(String brand,String color,int price)
{
	this();
this.brand=brand;
this.color=color;
this.price=price;
}
public Sandal()
{
	System.out.println("Dummy Constructor created");
}
}