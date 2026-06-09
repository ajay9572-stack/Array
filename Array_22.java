import java.util.Scanner;
        //min. value of an array
public class Array_22 {
    public static void main(String[] args) {
         System.out.println("enter size of an array: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int minimumvalue =Integer.MAX_VALUE;
         System.out.println("enter element of an array: ");
        for (int i= 0; i<n;i++){
            arr[i]=  sc.nextInt();
           
        }
         for (int i= 0; i<n;i++){
              if(arr[i]<minimumvalue){
                minimumvalue= arr[i];
            }
         }
         System.out.println("Print array: ");
        System.out.println(minimumvalue);
    }
}
