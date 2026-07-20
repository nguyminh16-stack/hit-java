import java.text.DecimalFormat;
import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
            // nhap du lieu
                System.out.println("nhap canh a1 = ") ;
                int a1 = Integer.parseInt(sc.nextLine()) ;
                System.out.println("nhap canh a2 = ") ;
                int a2 = Integer.parseInt(sc.nextLine()) ;
                System.out.println("nhap canh a3 = ") ;
                int a3 = Integer.parseInt(sc.nextLine()) ;

            // xet dieu kien
                if(a1 + a2 > a3 && a1 - a2 < a3 )
                {
                    if(a2 + a3 > a1 && a2 - a3 < a1)
                    {
                        if(a1 + a3 > a2 && a1 - a3 < a2)
                        {
                            System.out.println(" du dieu kien tro thanh tam giac ") ;
                        }else
                        {
                            System.out.println("khong du dieu kien") ;
                        }
                    }else
                    {
                        System.out.println("khong du dieu kien");
                    }
                }else
                {
                    System.out.println("khong du dieu kien");
                }
            // xac dinh
                if(a1 == a2 && a2 == a3 )
                {
                    System.out.println("tam gia la tam giac deu ") ;
                }
                if(a1 == a2 || a1 == a3 || a2 == a3 )
                {
                    System.out.println("tam giac la tam giac can ") ;
                }

                // tinh toan
                    double p = (a1 + a2 + a3 ) /2 ;
                    double P = 2 * p ;
                    double s = p*(p-a1)*(p-a2)*(p-a3) ;
                        s = Math.sqrt(s) ;
                        DecimalFormat df = new DecimalFormat("0.00") ;
                            System.out.println("chu vi cua tam giac la :" + P ) ;
                            System.out.println("dien tich tam giac la : " + df.format(s)) ;

        }
    }