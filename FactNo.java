class FactNo
{
public static void main(String a[])
{
int factvalue=fact(5);
System.out.println("Ans is " +factvalue);
}
public static int fact(int factNum)
{
int f=1;
for(int i=1;i<=factNum;i++)
{
f=f*i;
}
return f;
}
}