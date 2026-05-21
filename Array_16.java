import java.util.Scanner;
// find index no in an array
public class Array_16 {
    public static void main(String[] args) {
        System.out.println("enter row: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int []a = new int[n];
         System.out.print("enter index: ");
         for( int i =0; i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("enter x: ");
        int x = sc.nextInt();
        int lastindex = -1;
        for (int i = 0; i<n;i++)
        {
          if(a[i]==x)
          {
            lastindex = i;
          }  
        }
       System.out.println(lastindex);
    }
    }
