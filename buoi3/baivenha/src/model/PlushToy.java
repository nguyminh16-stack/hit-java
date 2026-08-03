package model;

public class PlushToy extends Toy {
    private String material ;

    public PlushToy(String id , String name , double price , int quanlity , int warrenty ) {
        super(id,name,price,quanlity) ;
        this.material = material ;
    }

    public String getMaterial() {
        return material ;
    }
    public void setMaterial(String material) {
        this.material = material ;
    }
    @Override
    public double calculateDiscount() {
        return this.getPrice() * 0.1;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Chất liệu: %s | Tiền giảm giá: %.2f\n", material, calculateDiscount());
    }



}
