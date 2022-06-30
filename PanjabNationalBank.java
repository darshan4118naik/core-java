class PanjabNationalBank extends Bank
{
	public void intrestPer(double intrest)
	{
		System.out.println("PanjabNationalBank");
		intrest=intrest+1;
		super.intrestPer(intrest);
	}
	
}