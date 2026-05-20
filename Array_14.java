import java.util.Scanner;

// Selection sort for strings// 

public class Array_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();        
        String[] a = new String[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
         String temp = "";
         int min;
        for ( int i = 0; i <n; i++){
            min = i;
            for (int j = i+1; j<n;j++){
                if( a[j].compareTo(a[min]) < 0){
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
        sc.close();
    }
}
