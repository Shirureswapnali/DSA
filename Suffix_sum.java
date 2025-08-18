import java.util.*;
class Suffix_sum
{
	public static void main(String args[])
	{
int size;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Array element size");
size=sc.nextInt();
int[]a=new int[size];
int[]b=new int[size];
int i;
System.out.println("Enter the array element");
for(i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
b[size-1]=a[size-1];
for(i=size-2;i>=0;i--)
{
b[i]=a[i]+b[i+1];
}
for(i=0;i<size;i++)
{
System.out.println(""+b[i]);
}
}
}