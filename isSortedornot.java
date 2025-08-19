import java.util.*;
class  isSortedornot
{
public static void main(String args[])
{
int size,i;
boolean sorted=true;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Array element size");
size=sc.nextInt();
int[]a=new int[size];
System.out.println("Enter the Array element");
for(i=0;i<size;i++)
{
a[i]=sc.nextInt();
}

for(i=0;i<size-1;i++)
{
if(a[i]>a[i+1])
{
sorted=false;
break;
}
}
if(sorted)
{
System.out.println("Elements are sorted");
}
else
{
System.out.println("Elements are not sorted");
}
}
}