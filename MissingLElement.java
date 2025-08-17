import java.util.*;
class MissingLElement
{
public static void main(String args[])
{
 int size,i;
 int sum=0,sum1=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Size of Array");
 size=sc.nextInt();
 int[]a=new int[size];
 for(i=0;i<size;i++)
 {
 a[i]=sc.nextInt();
 sum+=a[i];
 }
 for(i=1;i<=size+1;i++)
 {
 sum1+=i;
 }
 int missing=sum1-sum;
 System.out.println("Missing Element From Array is"+missing);
 }
 }