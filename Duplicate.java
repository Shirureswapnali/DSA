import java.util.*;
class Duplicate
{
public static void main(String args[])
{
final int x=5;
int[]a=new int[x];
int i,h=0;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the array element");
for(i=0;i<x;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<x;i++)
{
for(int j=i+1;j<x;j++)
{
if(a[i]==a[j])
{
System.out.println("Duplicate element"+a[i]);
break;
}
}
}
}
}