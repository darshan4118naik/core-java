class OnePlusTv
{
static String brand = "OnePlus";
static String color = "Black";
static double price = 35000;
static boolean isTurnedOn;
static int maxVolume=6;
static int minVolume=0;
static int currentVolume;
 
public static void isTurnedOn()

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
public static void increaseVolume()
	
	{
		if(isTurnedOn == true)
		{
		if(currentVolume < maxVolume)
			{
				currentVolume = currentVolume+1;
				System.out.println("Current Volume Is " +currentVolume); 
			}
		else if(currentVolume == maxVolume)
			{
			System.out.println("volume Reached max"); 
			}
		}
		
	
		else if(isTurnedOn == false)		{
			System.out.println("Tv ON mad mare");
		}
	}
	public static void decreseVolume()
	{
		if(isTurnedOn == true)
		{
			if(currentVolume > minVolume)
			{
				currentVolume=currentVolume - 1;
				System.out.println("Current Volume Is " +currentVolume); 
			}
			else if(currentVolume == minVolume)
			{
				System.out.println("volume Reached min"); 
			}
		}
		else if(isTurnedOn == false)
		{
			System.out.println("Speaker ON mad mare");
		}
	}

public static void main(String a[])
{
	isTurnedOn();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	decreseVolume();
		decreseVolume();
			decreseVolume();
				decreseVolume();
					decreseVolume();
						decreseVolume();
						
}
}