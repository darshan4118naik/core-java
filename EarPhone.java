class EarPhone
{
String brand;
String color;
int price;
public static void main(String a[])
{
EarPhone earPhone = new EarPhone("1+" , "Black" ,2500);
System.out.println ("EarPhone Brand Name : " +earPhone.brand);
System.out.println ("EarPhone color  : " +earPhone.color);
System.out.println ("EarPhone price : " +earPhone.price);
}
public EarPhone(String brand,String color,int price)
{
	this();
this.brand=brand;
this.color=color;
this.price=price;
}
public EarPhone()
{
	System.out.println("Dummy Constructor created");
}
}