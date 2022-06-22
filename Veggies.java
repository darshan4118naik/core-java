class Veggies
{
static String veggies[] = { "Onoin","Tomato","Beetrot","Potato","Carrot","Coriandor","Mint"};
public static void main(String a[])
{
String veg = getveg("Potato");
System.out.println("Veg Name is " +veg);
}
public static String getveg(String veg)
{
//String vegName = null;
for(int i=0;i<veggies.length;i++)
{
if(veggies[i]==veg)
{
   //vegName=veg;
}
else
{
	System.out.println("not available " +veg);
	break;
}
}
return veg;
}
}