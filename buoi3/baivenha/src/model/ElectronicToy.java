package model;

public class ElectronicToy extends Toy {
    private int warranty ;

    public ElectronicToy(String id , String name , double price , int quanlity , int warrenty ) {
        super(id,name,price,quanlity) ;
        this.warranty = warrenty ;
    }

    public int getWarrenty() {
        return warranty ;
    }
    public void setWarrenty(int warrenty) {
        this.warranty = warranty ;
    }
    @Override
    public double calculateDiscount() {
        if(this.getPrice() > 500.0 ){
            return this.getPrice() * 0.05 ;
        }
        return 0 ;
    }
    @Override

    public void printInfo() {
        super.printInfo(); ;
        System.out.printf("   -> [Điện tử] Bảo hành: %d tháng | Tiền giảm giá: %.2f\n", warranty, calculateDiscount());
    }




}
