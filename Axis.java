class Axis extends Bank
{
	public void intrestPer(double intrest)
	{
		System.out.println("AxisBank");
		intrest=intrest+1.7;
		super.intrestPer(intrest);
	}
	
}