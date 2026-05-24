import java.util.Scanner;

public class Array_19  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a [] = new int[n];
        int arr[] = new int[n];
        System.out.print("enter index: ");
        for ( int i = 0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int j =0;
        for(int i=n-1; i>=0;i--)
        {
              arr[j]=a[i];
              j++;
        }
       for(int i=0;i<a.length;i++){
        System.out.println(arr[i]);
       }
       sc.close();
    }
}
