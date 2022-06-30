class AccountTester
{
public static void main (String a[])
{
	SavingsAcc sa = new SavingsAcc(0.3);
	sa.deposit(500.00);
	sa.deposit(1500.00);
	//sa.periodicIntrest();
	double amount = sa.getTotalAmount();
	//System.out.println("Balance of Other's Acc : " +amount);
	
		SavingsAcc other = new SavingsAcc(0.2);
	sa.transfer(1000 , other);
	//other.withdaw(500);
	double balanceAmount = other.getTotalAmount();
	System.out.println("Balance of Other's Acc : " +balanceAmount);
	
	CurrentAcc ca = new CurrentAcc();
 ca.deposit(1000);
 ca.getTransactionCount();
//ca.deductFee();
 ca.getTotalAmount();
 ca.deposit(1500);
 ca.getTransactionCount();
 //ca.deductFee();
 ca.getTotalAmount();
 ca.deposit(2000);
 ca.getTransactionCount();
 //ca.deductFee();
 ca.getTotalAmount();
 ca.deposit(3000);
 ca.getTransactionCount();
 //ca.deductFee();
ca.getTotalAmount();
ca.deductFee();


}
}