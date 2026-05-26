 import java.util.Scanner;
           // max value of an array//

public class Array_21 {
   
    public static void main(String[] args) {
        System.out.print("enter size of an array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] number = new int[n];
        int maximumvalue = 0;
        System.out.println("enter element of an array:");
        for (int i =0; i<n;i++){
           number [i] = sc.nextInt();
        }
        for (int i=  0; i<n; i++){
           if (number[i]>maximumvalue){
               maximumvalue = number[i];
            }

        }
        System.out.println("print maximum element of an araray: ");
        System.out.println(maximumvalue);
    }
}


