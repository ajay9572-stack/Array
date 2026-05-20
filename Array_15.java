import java.util.Scanner;
// Insertion sort for integers//

public class Array_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int temp;
        int j;

        for (int i = 0; i < n; i++) {
            temp = a[i];
            j = i;
            while(j > 0 && a[j - 1] > temp) {
                a[j] = a[j - 1];
                j = j-1;;
            }
            a[j] = temp;
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
