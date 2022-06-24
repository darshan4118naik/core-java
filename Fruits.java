class Fruits
{
String name;
int price;
public static void main(String a[])
{
Fruits f = new Fruits( "Mango",100);
System.out.println(f.name +" : " +f.price );

}
public Fruits()
{
	//this.provideNutrition();
	this("Chikku",100);
	System.out.println("C created" );

}

public Fruits(String name,int price)
{
	
this();
this.name=name;

this.price=price;
}
public void provideNutrition()
{
	System.out.println("Method created" );//this();
}
}