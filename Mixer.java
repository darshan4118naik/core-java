class Mixer
{
static String brand = "Buterfly";
static String color = "Grey";
static double price = 9000;
static boolean isTurnedOn;
static int maxSpeed=4;
static int minSpeed;
static int currentSpeed;
 
public static void isTurnedOn()

{
if(isTurnedOn == false)
{ isTurnedOn = true;
System.out.println("Mixer is on");
}

else if (isTurnedOn == true)
{ isTurnedOn = false;
System.out.println("Mixer is off");
}
}
public static void increaseSpeed()
	
	{
		if(isTurnedOn == true)
		{
		if(currentSpeed < maxSpeed)
			{
				currentSpeed = currentSpeed+1;
				System.out.println("Current speed Is " +currentSpeed); 
			}
		else if(currentSpeed == maxSpeed)
			{
			System.out.println("Speed Reached max"); 
			}
		}
		
	
		else if(isTurnedOn == false)		{
			System.out.println("Mixer ON mad mare");
		}
	}
	public static void decreseSpeed()
	{
		if(isTurnedOn == true)
		{
			if(currentSpeed > minSpeed)
			{
				currentSpeed=currentSpeed - 1;
				System.out.println("Current speed Is " +currentSpeed); 
			}
			else if(currentSpeed == minSpeed)
			{
				System.out.println("Speed Reached min"); 
			}
		}
		else if(isTurnedOn == false)
		{
			System.out.println("Mixer ON mad mare");
		}
	}

public static void main(String a[])
{
	isTurnedOn();
	increaseSpeed();
	increaseSpeed();
	increaseSpeed();
	increaseSpeed();
	increaseSpeed();
	increaseSpeed();
	increaseSpeed();
	decreseSpeed();
	decreseSpeed();
	decreseSpeed();
	decreseSpeed();
	decreseSpeed();
	decreseSpeed();
	
	
}
}