class BankAccount
{
static double amount =500;
public static void main (String a[])
{
deposit (2000);
deposit (3000);
}

static void deposit(double amt)
{
amount = amount + amt;
System.out.println("amount to be dpst" +amt);
System.out.println("available amount" +amount);

}
}