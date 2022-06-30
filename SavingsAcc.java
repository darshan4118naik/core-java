class SavingsAcc extends BankAccount
{
double intrestRate;
public SavingsAcc(double intrestRate)
{
this.intrestRate = intrestRate;
}
public double periodicIntrest()
{
double intrest = getTotalAmount()*intrestRate /100;
System.out.println("Intrest is : " +intrest);
deposit(intrest);
return intrest;

}

}