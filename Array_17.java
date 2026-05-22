import java.util.Scanner;
// target =  sum of pair elemet; how much pair element of sum = target//
public class Array_17 {
    public static void main(String[] args) {
        System.out.print("enter element");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a [] =  new int[n];
        System.out.print("enter index: ");
        for(int i = 0; i<n; i++ )
        {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        System.out.println("target is:");
        int target = sc.nextInt();
        for(int i = 0; i<n; i++ )
        {
            for (int j = i+1; j<n;j++)
            {
                if(a[i]+a[j] == target)
                {
                ans++;
                }
            }
        }
        System.out.print(ans);
        System.out.println(" pair of element");
        sc.close();
    } 
}
