import java.util.Scanner;
         //Array input//
public class Array_10 {

    public static void main(String[] args) {
      System.out.println("enter size of an array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        System.out.println("enter element of an array: ");
        for(int i=0; i<n;i++){
          a[i]= sc.nextInt();
        }
          System.out.println("Print array: ");
        for(int i=0; i<n;i++){
            System.out.print(a[i]+ " ");
 
        }
        sc.close();
    }  
}
