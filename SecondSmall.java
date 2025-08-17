import java.util.*;
class SecondSmall
{
public static void main(String args[])
{
final int size=5;
int[]a=new int[size];
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Array element");
for(i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
int k=a[0];
for(i=0;i<size;i++)
{
if(a[i]<k)
{
k=a[i];
}
}
int secsmall=Integer.MAX_VALUE;
for(i=0;i<size;i++)
{
if(a[i]!=k&&a[i]<secsmall)
{
secsmall=a[i];
}
}
System.out.println("Second Small"+secsmall);
}
}
