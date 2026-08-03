import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("truong trinh kiem tra nam nhuan ");
        System.out.println("nhap so nam can kiem tra : ");
        int nam = sc.nextInt() ;
        if((nam % 4 ) == 0)
        {
            if((nam % 100) == 0)
            {
                if((nam % 400 == 0))
                {
                    System.out.println("nam" + nam + "la nam nhuan");
                }else
                {
                    System.out.println("nam do ko phai nam nhuan");
                }
            }else
            {
                System.out.println("nam do ko phai nam nhuan");
            }
        }else
        {
            System.out.println("nam do ko phai nam nhuan");
        }


    }
}