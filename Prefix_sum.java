import java.util.*;
class Prefix_sum
{
public static void main(String args[])
{
int size,sum=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array size");
size=sc.nextInt();
int[]a=new int[size];
int []b=new int[size];
System.out.println("Enter the array element");
for(i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
b[0]=a[0];
for(i=1;i<size;i++)
{
	b[i]=b[i-1]+a[i];

}
for(i=1;i<size;i++)
{
System.out.println("prefix sum"+b[i]);
}
}
}