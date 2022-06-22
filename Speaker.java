class Speaker
{
static String brand = "BOSE";
static double Price = 5000;
static String color = "Black";
static boolean isConnected;
static int maxVolume=6;
static int minVolume=0;
static int currentVolume;

public static void onOrOff()
{
if(isConnected == false)
{ isConnected = true;
System.out.println("Speaker is turned on ...Available to connect");
}
else if(isConnected == true)
{ isConnected = false;
System.out.println("Speaker is turned off ");
System.out.println("Speaker end of onoroff ");
}
}

	public static void increaseVolume()
	
	{
		if(isConnected == true)
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
		
	
		else if(isConnected == false)		{
			System.out.println("Speaker ON mad mare");
		}
	}
	public static void decreseVolume()
	{
		if(isConnected == true)
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
		else if(isConnected == false)
		{
			System.out.println("Speaker ON mad mare");
		}
	}
	

public static void main(String a[]){
onOrOff();
increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
onOrOff();
decreseVolume();
decreseVolume();
decreseVolume();
decreseVolume();
decreseVolume();
decreseVolume();
decreseVolume();
decreseVolume();
}
}