import java.util.*;
class FirstRepeatedElement
{
public static void main(String args[])
{
int size,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array size");
size=sc.nextInt();
int[]a=new int[size];
for(i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
//System.out.println("Enter the key element to search");
//int key=sc.nextInt();
boolean found=false;
for(i=0;i<size;i++)
{
for(j=i+1;j<size;j++)
{
if(a[i]==a[j])
{
System.out.println(""+a[i]+i);
found=true;
break;
}
}
if(found)
	break;
}
if(!found)
{
	System.out.println("There is no repeated element");
}
}
}