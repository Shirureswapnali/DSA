import java.util.*;
class Occurence
{
public static void main(String args[])
{
int size;
int i,j,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Array size");
size=sc.nextInt();
int[]a=new int[size];
System.out.println("Enter the Array element");
for(i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter the element to find out the occurent");
int x=sc.nextInt();
for(i=0;i<size;i++)
{
if(a[i]==x)
{
count++;
}
}

System.out.println("Count"+count);
}
}