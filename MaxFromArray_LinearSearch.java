import java.util.*;
class MaxFromArray_LinearSearch
{
	public static void main(String args[])
	{
int size;
Scanner sc=new Scanner(System.in);
size=sc.nextInt();
int[]a=new int[size];
int i;
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
System.out.println(""+k+""+i);
}
}
