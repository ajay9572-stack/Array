import java.util.Scanner;

public class Array_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();        
        int[] a = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
         int temp = 0;
         int min;
        for ( int i = 0; i <n; i++){
            min = i;
            for (int j = i+1; j<n;j++){
                if( a[j]<a[min]){
                    min =j;
                }
            }
             temp = a[i];
             a[i] = a[min];
             a[min] = temp;
        }
        System.out.println("Sorted array:");
        for (int i = 0; i <n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
