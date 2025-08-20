import java.util.*;
class FindSmallElementFromArray
{
public static void main(String args[])
{
int row,cols;
int i,j;
Scanner sc=new Scanner(System.in);
row=sc.nextInt();
cols=sc.nextInt();
int[][]a=new int[row][cols];
for(i=0;i<row;i++)
{
for(j=0;j<cols;j++)
{
a[i][j]=sc.nextInt();
}
}
for(i=0;i<row;i++)
{
int k=a[i][0];
for(j=0;j<cols;j++)
{
if(a[i][j]<k)
{
k=a[i][j];
}
}
System.out.println(" largest ELement"+k);
}
}
}
