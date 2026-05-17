public class Array_08 { 
    //3D array initialization using new keyword
    public static void main(String[] args) {
        int [][][] a = new int[2][3][2];
        a[0][0][0] = 10;
        a[0][0][1] = 20;
        a[0][1][0] = 30;
        a[0][1][1] = 40;
        a[0][2][0] = 50;
        a[0][2][1] = 60;
        a[1][0][0] = 70;
        a[1][0][1] = 80;
        a[1][1][0] = 90;
        a[1][1][1] = 100;
        a[1][2][0] = 110;
        a[1][2][1] = 120;
        System.out.println(a[1][1][0]);
    }
}
