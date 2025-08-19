import java.util.*;
class ReverseArray
{
public static void main(String args[])
{
int size,i;
Scanner sc=new Scanner(System.in);
size=sc.nextInt();
int[]a=new int[size];
System.out.println("Enter the Array element");
for(i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Reversed Array elements Are:");
for(i=size-1;i>=0;i--)
{
System.out.println(+a[i]);
}
}
}