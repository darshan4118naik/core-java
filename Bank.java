class Bank
{
static double amount =1000;
public static void main (String a[])
{
withdraw(200);
withdraw(500);
}
static void withdraw(double amt)
{
amount = amount-amt;
System.out.println("withdrawn amount" +withdraw);
System.out.println("balance amount" +amount);
System.out.println("total amount" +amount);
}
}
