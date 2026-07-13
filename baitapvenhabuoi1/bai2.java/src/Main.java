import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner intput = new Scanner(System.in);
        do {
            System.out.println("nhap so nguyen n (1<=n<=100) : ");
            n = intput.nextInt();
            if (n > 100 || n < 1) {
                System.out.println("n sai dieu kien vui long nhap lai !!!");
            }
        } while (n > 100 || n < 1);
        // khai bao mang so nguyen
        int[] a = new int[n];
        System.out.println("nhap cac phan tu cua mang ");
        for (int i = 0; i < n; i++)
        {
            System.out.println("nhap phan tu thu a[" + i + "] :");
            a[i] = intput.nextInt();
        }
        System.out.println("mang vua nhap la : ") ;
        for(int i = 0 ; i < n ; i++ )
        {
            System.out.println(a[i] + "   ") ;
        }
        int s = 0 ;
        int h = 0 ;
        int t = 1 ;
        int z = 0 ;
        h = a[0] + a[n-1] ;
        if(a[n-1]==0)
        {
            System.out.println("phan tu cuoi = 0 ") ;
        }
        else
        {
            z = a[0] / a[n - 1] ;
        }
        for(int i = 0 ; i < n ; i++ )
        {
            s = s + a[i] ;

            t = t * a[i] ;

        }
        int tam = 0 ;
        for(int i = 0 ; i < n ; i++ )
        {
            for(int j = 1 ; j < n ; j++)
            {
                if(a[i] < a[j])
                {
                    tam = a[i] ;
                    a[i] = a[j] ;
                    a[j] = tam ;
                }
            }
        }
        System.out.println("tong la : " + s ) ;
        System.out.println("hieu la : " + h) ;
        System.out.println("tich la : " + t) ;
        System.out.println("thuong la : " + z) ;
            System.out.println("so nho nhat la : " + a[n-1]) ;
            System.out.println("so lon nhat la : " + a[0]) ;



    }
}



