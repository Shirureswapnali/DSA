import java.util.*;

class FirstnonRepeatedElement {
    public static void main(String args[]) {
        int size, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter elements:");
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        boolean found = false;

        for (i = 0; i < size; i++) {
            boolean isRepeated = false;

            for (j = 0; j < size; j++) {
                if (i != j && a[i] == a[j]) { // check all other elements
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) { 
                System.out.println("First non-repeated element: " + a[i] + " at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeated element found.");
        }
    }
}
