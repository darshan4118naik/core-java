class Laptop1
{
String brand;
String model;
int price;
public static void main(String a[])
{
Laptop1 lap = new Laptop1("Dell" , "Inspiron 14" , 75000);
System.out.println ("Laptop Brand Name : " +lap.brand);
System.out.println ("Laptop Model  : " +lap.model);
System.out.println ("Laptop price : " +lap.price);
}
public Laptop1(String brand,String model,int price)
{
	this();
this.brand=brand;
this.model=model;
this.price=price;
}
public Laptop1()
{
	System.out.println("Dummy Constructor created");
}
}