import java.util.*;
class Linearsearch
{
public static void main(String args[])
{
int size,flag=0,i,key;
Scanner sc=new Scanner(System.in);
size=sc.nextInt();
int[]a=new int[size];
for(i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter the key element to search");
key=sc.nextInt();
for(i=0;i<size;i++)
{
if(a[i]==key)
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.println("Key element found"+a[i]+"at index"+i);
}
else
{
System.out.println("Element is not found");
}
}
}