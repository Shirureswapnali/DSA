import java.util.*;
class maxdifference_bet_two_element
{
    public static void main(String args[])
    {
        int size, k = 0, s = Integer.MIN_VALUE, i, x; // keep your variables
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array elements:");
        for (i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }

        // Brute force: compare all pairs
        for (i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                k = a[j] - a[i]; 
                if (k > s)
                {
                    s = k;       
                }
            }
        }

        System.out.println("Maximum difference: " + s);
    }
}
