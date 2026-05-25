import java.util.Scanner;
           // sum of an array//
public class Array_20 {
    
   public static void main(String[] args) {
    System.out.print("enter size of an array: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] number = new int[n];
    int sum = 0;
    System.out.println("enter elemnt of an array: ");
    for( int i = 0; i<n;i++){
       number[i] = sc.nextInt();

    }
 for(int i =0; i<n;i++){
    sum = sum+ number[i];
    
 }

//  System.out.print( sum);
}

}
