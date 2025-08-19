import java.util.*;
class Selection
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
for(j=i+1;j<size;j++)
{
if(a[j]<a[i])
{
temp=a[j];
a[j]=a[i];
a[i]=temp;
}
}
}
System.out.println("Your Array elements are:");
for(i=0;i<size;i++)
{
System.out.println(""+a[i]);
}
}
}