import java.util.*;
class MinFromArray_LinearSearch
{
public static void main(String args[])
{
int size,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Array size");
size=sc.nextInt();
int[]a=new int[size];
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
System.out.println(""+k+""+i);
}
}