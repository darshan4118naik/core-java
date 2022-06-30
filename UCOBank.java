class UCOBank extends Bank
{
	public void intrestPer(double intrest)
	{
		System.out.println("UCOBank");
		intrest=intrest+2.5;
		super.intrestPer(intrest);
	}
	
}