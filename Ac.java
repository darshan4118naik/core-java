class Ac
{
static String brand = "Samsung";
static String color = "White";
static double price = 35000;
static boolean isTurnedOn;
static int maxTemp=24;
static int minTemp=16;
static int currentTemp=15;
 
public static void isTurnedOn()

{
if(isTurnedOn == false)
{ isTurnedOn = true;
System.out.println("Ac is on");
}

else if (isTurnedOn == true)
{ isTurnedOn = false;
System.out.println("Ac is off");
}
}
{
if(isTurnedOn == false)
{ isTurnedOn = true;
System.out.println("Tv is on");
}

else if (isTurnedOn == true)
{ isTurnedOn = false;
System.out.println("Tv is off");
}
}
public static void increaseTemp()
	
	{
		if(isTurnedOn == true)
		{
		if(currentTemp < maxTemp)
			{
				currentTemp = currentTemp+1;
				System.out.println("Current Temp Is " +currentTemp); 
			}
		else if(currentTemp == maxTemp)
			{
			System.out.println("Temp Reached max"); 
			}
		}
		
	
		else if(isTurnedOn == false)		{
			System.out.println("Ac ON mad mare");
		}
	}
	public static void decreseTemp()
	{
		if(isTurnedOn == true)
		{
			if(currentTemp > minTemp)
			{
				currentTemp=currentTemp - 1;
				System.out.println("Current Temp Is " +currentTemp); 
			}
			else if(currentTemp == minTemp)
			{
				System.out.println("Temp Reached min"); 
			}
		}
		else if(isTurnedOn == false)
		{
			System.out.println("Ac ON mad mare");
		}
	}

public static void main(String a[])
{
	isTurnedOn();
	increaseTemp();
	increaseTemp();
	increaseTemp();
	increaseTemp();
	increaseTemp();
	increaseTemp();
	increaseTemp();
	increaseTemp();
	increaseTemp();
	increaseTemp();
	increaseTemp();
	increaseTemp();
	increaseTemp();
	decreseTemp();
	decreseTemp();
	decreseTemp();
	decreseTemp();
	decreseTemp();
	decreseTemp();
	decreseTemp();
	decreseTemp();
	decreseTemp();
	
}
}