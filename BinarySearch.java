import java.util.*;
class BinarySearch
{
public static void main(String args[])
{
int size,i,j,mid;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array element");
size=sc.nextInt();
int[]a=new int[size];
for(i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter the key element to search");
int key=sc.nextInt();
i=0;
j=size-1;
boolean found=false;
while(i<=j)
{
mid=(i+j)/2;
if(a[mid]==key)
{
System.out.println(""+a[mid]);
found=true;
break;//1 2 3 4
}
else if(a[mid]>key)
{
j=mid-1;
}
else 
{
i=mid+1;
}
}
if(!found)
{
	System.out.println("Element is not found");
}
}
}