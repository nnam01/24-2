package week4.hw;

import java.util.Scanner;

public class Item {
    int num;
    String code;
    String name;
    int price;
    static int itemCount = 0;

    Item(String code){
        itemCount++;
        this.num = itemCount;
        this.code = code;
    }
    void read(Scanner scanner){
        name = scanner.next();
        price = scanner.nextInt();
    }
    void print(){
        System.out.printf("[%d] %s %s (%d원)\n", num, code, name, price);
    }

    boolean matches(){
        return false;
    }
}
