import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int chieuDai ;
        int chieuRong ;
        System.out.printf("nhap chieu dai hinh chu nhat :");
        chieuDai = sc.nextInt() ;
        System.out.printf("nhap chieu rong hinh chu nhat :");
        chieuRong = sc.nextInt() ;
        // tinh chu vi dien tich
        int s , p ;
            p = chieuDai + chieuRong ;
            s = chieuDai * chieuRong ;
        System.out.println("chu vi hinh chu nhat la " + p  );
        System.out.println("dien tich hinh chu nhat la " + s  );







    }
}