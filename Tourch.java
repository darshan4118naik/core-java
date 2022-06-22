class Tourch
{
static String brand = "Everday";
static String color = "Silver";
static double price = 1000;
static boolean isTurnedOn;
static int maxBr=3;
static int minBr=0;
static int currentBr;
 
public static void isTurnedOn()

{
if(isTurnedOn == false)
   {
	isTurnedOn = true;
    System.out.println("Tourch is on");
   }

else if (isTurnedOn == true)
   { 
      isTurnedOn = false;
       System.out.println("Tourch is off");
   }
}
public static void increaseBr()
	
	{
		if(isTurnedOn == true)
		{
		if(currentBr < maxBr)
			{
				currentBr = currentBr+1;
				System.out.println("Current BR Is " +currentBr); 
			}
		else if(currentBr == maxBr)
			{
			System.out.println("BR Reached max"); 
			}
		}
		
	
		else if(isTurnedOn == false)		{
			System.out.println("Tourch ON mad mare");
		}
	}
	public static void decreseBr()
	{
		if(isTurnedOn == true)
		{
			if(currentBr > minBr)
			{
				currentBr=currentBr - 1;
				System.out.println("Current BR Is " +currentBr); 
			}
			else if(currentBr == minBr)
			{
				System.out.println("BR Reached min"); 
			}
		}
		else if(isTurnedOn == false)
		{
			System.out.println("Tourch ON mad mare");
		}
	}

public static void main(String a[])
{
	isTurnedOn();
	
	System.out.println("Brand Name()" +brand);
	System.out.println("Color of the Tourch()  " +color);
	increaseBr();
	increaseBr();
	increaseBr();
	increaseBr();
	decreseBr();
	decreseBr();
	decreseBr();
	decreseBr();
	
}
}