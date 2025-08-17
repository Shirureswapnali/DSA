import java.util.*;
class SecondLarge
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
if(a[i]>k)
{
k=a[i];
}
}
int large=-1;
for(i=0;i<size;i++)
{
if(a[i]>large&&a[i]<k)
{
large=a[i];
}
}
System.out.println("Second Large"+large);
}
}
