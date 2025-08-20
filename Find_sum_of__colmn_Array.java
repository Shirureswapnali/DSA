import java.util.*;
class Find_sum_of__colmn_Array
{
public static void main(String args[])
{
int row,cols;
int i,j,sum=0;
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
for(i=0;i<cols;i++)
{
for(j=0;j<row;j++)
{
sum+=a[j][i];
}
System.out.println(""+sum);
}
}
}