import java.util.*;
class Averageof_element_fromarray
{
	public static void main(String args[])
	{
int size,i;
double total=0,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Array size");
size=sc.nextInt();
int[]a=new int[size];
System.out.println("Enter the Array element");
for(i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<size;i++)
{
sum+=a[i];
}
total=sum/size;
System.out.println(" Avg of Arry element"+total);
}
}