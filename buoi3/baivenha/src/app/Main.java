package app;

import model.Toy;
import model.ElectronicToy;
import model.PlushToy;

public class Main {
    public static void main(String[] args) {
        Toy[] toys = new Toy[3];
        toys[0] = new Toy("T01", "Lego", 300.0, 10);
        toys[1] = new ElectronicToy("E01", "Robot", 600.0, 5, 12);
        toys[2] = new PlushToy("P01", "Gấu bông Teddy", 200.0, 20, 1);
        System.out.println("=== DANH SÁCH SẢN PHẨM CỬA HÀNG ĐỒ CHƠI ===");
        for (Toy toy : toys) {
            toy.printInfo();
        }
    }
}