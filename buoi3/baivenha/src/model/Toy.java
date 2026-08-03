package model;

public class Toy {
    private String id ;
    private String name ;
    private double price ;
    private int quanlity ;

    // get -- set
    public String getId()  {
        return id ;
    }
    public void setId(String id)  {
        this.id = id ;
    }
    public String getname() {
        return name ;
    }
    public void setName(String name) {
        this.name = name ;
    }
    public double getPrice() {
        return price ;
    }
    public void setPrice(double price) {
        if(price < 0) {
            System.out.println("gia ban khong hop le!! ") ;
        } else {
            this.price = price ;
        }
    }
    public int getQuanlity() {
        return quanlity ;
    }
    public void setQuanlity(int Quanlity) {
        if(quanlity < 0) {
            System.out.println("so long khong hop le !!") ;
        }else {
            this.quanlity = quanlity ;
        }
    }
    public Toy(String id , String name , double price , int quanlity ) {
        this.id = id ;
        this.name = name ;
        this.setPrice(price) ;
        this.setQuanlity(quanlity) ;
    }

    public double calculateDiscount() {
        return 0 ;
    }
    public void printInfo() {
        System.out.printf("Mã: %s | Tên: %s | Giá: %.2f | Số lương: %d/n" , id , name , price , quanlity ) ;
    }


}
