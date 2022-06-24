class Tshirt
{
String brand;
String color;
int price;
public static void main(String a[])
{
Tshirt tshirt = new Tshirt("Flying machine" , "Sky blue" ,800);
System.out.println ("Tshirt Brand Name : " +tshirt.brand);
System.out.println ("Tshirt color  : " +tshirt.color);
System.out.println ("Tshirt price : " +tshirt.price);
}
public Tshirt(String brand,String color,int price)
{
	this();
this.brand=brand;
this.color=color;
this.price=price;
}
public Tshirt()
{
	System.out.println("Dummy Constructor created");
}
}