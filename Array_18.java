import java.util.Scanner;
// unique no. of an array//
public class Array_18 {
    public static void main(String[] args) {
        System.out.println("enter element");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a [] =  new int[n];
        System.out.print("enter index: ");
        for(int i = 0; i<n; i++ )
        {
            a[i] = sc.nextInt();
        }
        
        for(int i = 0; i<n; i++ )
        {
            for (int j = i+1; j<n;j++)
            { 
                if(a[i]== a[j])
                {
                a[i]= -1;
                a[j] = -1;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i<n; i++ )
        {
          if(a[i]>0)
         {
             ans = a[i];
         }
           
        }
         System.out.println(ans);   
   }
} 

