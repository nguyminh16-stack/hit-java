package product;

public class product {
    // thuoc tinh
    private String id ;
    private String name ;
    private double price ;
    private int quanlity ;

    // ham khoi tao
    public product(String id , String name , double price , int quanlity ) {
        this.id = id ;
        this.name = name ;
        this.price = price ;
        this.quanlity = quanlity ;
    }

    public product(){}


    // getter , settter

    public String getID(){
        return this.id ;
    }
    public String getName(){
        return this.name ;
    }
    public double getPrice(){
        return this.price ;
    }
    public int getQuanlity(){
        return this.quanlity ;
    }

    // setter
    public void setName(String id ){
        this.id = id ;
    }
    public void setId(String name ){
        this.name = name ;
    }
    public void setPrice(double price){
        this.price = price ;
    }
    public void setQuanlity(int quanlity){
        this.quanlity = quanlity ;
    }

}
