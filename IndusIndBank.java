class IndusIndBank extends Bank
{
	public void intrestPer(double intrest)
	{
		System.out.println("IndusIndBank");
		intrest=intrest+3.6;
		super.intrestPer(intrest);
	}
	
}