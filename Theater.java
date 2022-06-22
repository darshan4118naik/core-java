class Theater
{
String name;
String address;
long mobileNo;
String owner;
String[] runningMovies= new String[3];
public static void main(String a[])
{
//className refveriable = new className (syntax for object)
	Theater theater = new Theater();
	
theater.name="veeresh";
                                                           //
theater.address = "xyz";
                                                           //
theater.mobileNo = 8867696331L;
                                                           //
theater.owner = "Nane";

theater.runningMovies[0] ="Charlie 777";
theater.runningMovies[1] ="Vikram";
theater.runningMovies[2] ="Major";
                                                           //
 System.out.println("Theater name is " +theater.name);                                                         //runningMovies[] = {
System.out.println("Theater address is " +theater.address);
System.out.println("Theater mb is " +theater.mobileNo);
System.out.println("Theater owner is " +theater.owner);
theater.getRunningMovies();

Theater theater1 = new Theater();

	theater1.name="PVR";
	theater1.address = "xyz";
                                                           //
theater1.mobileNo = 8867696331L;
                                                           //
theater1.owner = "Nane";
theater1.runningMovies[0] ="Charlie 777";
theater1.runningMovies[1] ="Vikram";
theater1.runningMovies[2] ="Major";


                                                           //
 System.out.println("Theater name is " +theater1.name);                                                         //runningMovies[] = {
System.out.println("Theater address is " +theater1.address);
System.out.println("Theater mb is " +theater1.mobileNo);
System.out.println("Theater owner is " +theater1.owner);
theater1.getRunningMovies();
} 
public void getRunningMovies()
{
	for(int i=0;i<runningMovies.length;i++)
	{
		System.out.println(runningMovies[i]);
	}
	
}

 

 }
