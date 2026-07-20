import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("nhap x1 = ");
        int x1 = Integer.parseInt(sc.nextLine()) ;
        System.out.print("nhap y1 = ") ;
        int y1 = Integer.parseInt(sc.nextLine()) ;
        System.out.print("nhap x2 = ") ;
        int x2 = Integer.parseInt(sc.nextLine()) ;
        System.out.print("nhap y2 = ") ;
        int y2 = Integer.parseInt(sc.nextLine()) ;
        // hien thi
        System.out.println("toa do diem A(" + x1 + ";" + y1 + ")") ;
        System.out.println("toa do diem B(" + x2 + ";" + y2 + ")") ;
        // tinh toan
            int delX = x1 - x2 ;
            int delY = y1 - y2 ;
                double s = Math.pow(delX,2) + Math.pow(delY,2) ;
                    s = Math.sqrt(s) ;
        DecimalFormat df = new DecimalFormat("0.00") ;
        System.out.println("do dai cua 2 diem = " + df.format(s) ) ;




    }
}