import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("nhap vao so n : ");
        int n = sc.nextInt();
        int t = 0 ;
        int giaiThua = 1 ;
        for(int i = 1 ; i <= n ; i++ )
        {
            giaiThua = giaiThua * i ;
            if((i % 2) == 0 )
            {
                t = t + i ;
            }
        }

        System.out.println("gia tri cua n! = " + giaiThua );
        System.out.println("gia tri tong cac phan tu chan la = " + t);


    }
}