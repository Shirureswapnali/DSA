import java.util.*;
class even_odd
{
public static void main(String args[])
{
int size,sum_even=0,sum_odd=0,i;
Scanner sc=new Scanner(System.in);
size=sc.nextInt();
int[]a=new int[size];
System.out.println("Enter the array element");
for(i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<size;i++)
{
if(a[i]%2==0)
{
sum_even+=i;
}
else
{
sum_odd+=i;	
}
}
System.out.println("Even_index"+sum_even);
System.out.println("odd_index"+sum_odd);

}
}