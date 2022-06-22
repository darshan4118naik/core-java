class Ncr
{
public static void main(String a[])
{
int ncr=fact(5)/(fact(5-2)*fact(2));
System.out.println("Ans is " +ncr);
}
public static int fact(int factNo)      //npr=n!/(n-r)!
{                                        //ncr=n!/r!*(n-r)!
int n=1;
for(int i=1;i<=factNo;i++ )
{
n=n*i;
}
return n;

}
}