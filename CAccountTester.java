class CAccountTester
{
public static void main(String a[])
{
 BankAccount ca = new CurrentAcc();
 ca.deposit(1000);
 ca.getTransactionCount();
 ca.deductFee();
 ca.deposit(1500);
 ca.getTransactionCount();
 ca.deductFee();
 ca.deposit(2000);
 ca.getTransactionCount();
 ca.deductFee();
 ca.deposit(3000);
 ca.getTransactionCount();
 ca.deductFee();
double amount = ca.getTotalAmount();
//CurrentAcc caa = new CurrentAcc();


}



}