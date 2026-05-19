public class Array_05 {
    // 2D array with different column sizes that is jaggged arra
    public static void main(String[] args) {
        int [][] a = new int[2][];
        a[0] = new int[3];
        a[1] = new int[2];
        a[0][0] = 1;
        a[0][1] = 2;  
        a[0][2] = 3;
        a[1][0] = 4;  
        a[1][1] = 5;
        System.out.println(a[0][0]);
    }
}
