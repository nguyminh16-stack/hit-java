package product;

public class dienthoai {
    public static void main(String[] args) {
        product dienthoai = new product() ;
        product iPhone = new product("sanpham1" , "iPhone 17 promax " , 32000000 , 1) ;
        System.out.println(iPhone.getID()) ;
        System.out.println(iPhone.getName());
        System.out.println(iPhone.getPrice());
        System.out.println(iPhone.getQuanlity());


        // samsung
        product samsung = new product("sanpham2" , "Samsung s25 ultra " , 40000000 , 2) ;
        System.out.println(samsung.getName());
        System.out.println(samsung.getID());
        System.out.println(samsung.getPrice());
        System.out.println(samsung.getQuanlity());

        // vivo
        product vivo = new product("sanpham3" , "vivo x200 mini" , 50000000 , 3) ;
        System.out.println(vivo.getName());
        System.out.println(vivo.getID());
        System.out.println(vivo.getPrice()) ;
        System.out.println(vivo.getQuanlity());



    }



}
