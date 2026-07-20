import java.util.Scanner ;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Vui lòng nhập mật khẩu của bạn: ");
        String in = sc.nextLine();
        // xóa ký khoảng trắng 2 đầu
        String pass = in.trim() ;
        // cờ hiệu
        boolean checkDai = (pass.length() >= 8) ;
        boolean checkSo = false ;
        boolean checkChu = false ;
        // vong lap
        for(int i = 0 ; i < pass.length() ; i++ )
        {
            char ch = pass.charAt(i) ;
            // so sánh ký tự
            if (ch >= '0' && ch <= '9')
            {
                checkSo = true ;
            }
            if(ch >= 'A' && ch <= 'Z')
            {
                checkChu = true ;
            }

        }
        // hien thi ket qua
        if(checkDai && checkSo && checkChu )
        {
            System.out.println("mat khau hop le !") ;
        }else
        {
            System.out.println("mat khau ko hop le do :") ;
            if(!checkDai)
            {
                System.out.println("khong du 8 ky tu");
            }
            if(!checkSo)
            {
                System.out.println("khong co so");
            }
            if(!checkChu)
            {
                System.out.println("khong co chu");
            }
        }





    }
}