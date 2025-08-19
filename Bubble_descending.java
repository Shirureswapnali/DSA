import java.util.*;
class Bubble_descending
{
public static void main(String args[])
{
int size,i,j,temp;
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
for(j=0;j<size-i-1;j++)
{
if(a[j]<a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.println(" Sorted Array elements are:");
for(i=0;i<size;i++)
{
System.out.println(""+a[i]);
}
}
}