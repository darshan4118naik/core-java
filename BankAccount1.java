class BankAccount1
{
static double amount =500;
public static void main (String a[])
{
deposit (2000);
getTotalAmount(); //invoke/Caller method
deposit (3000);
getTotalAmount();
withdaw (1000);
getTotalAmount();
withdaw (500);
getTotalAmount();
deposit (2000); 
getTotalAmount();
deposit (3000);
getTotalAmount();
deposit (2000);
getTotalAmount(); //invoke/Caller method
deposit (3000);
getTotalAmount();
withdaw (1000);
getTotalAmount();
withdaw (500);
getTotalAmount();
withdaw (1000);
getTotalAmount();
withdaw (500);
getTotalAmount();
}
//Method Started
static void deposit(double amt) //called method
{
amount = amount + amt; 
System.out.println("amount to be dpst" +amt);


}
//Method Started
static void withdaw(double amt)
{
amount = amount - amt;
System.out.println("amount to be withdaw" +amt);

}
static void getTotalAmount()
{
	System.out.println("Total Amount" +amount);
}
}
