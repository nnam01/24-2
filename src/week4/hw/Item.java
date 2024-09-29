package week4.hw;

import java.util.Scanner;

public class Item {
    int num;
    String code;
    String name;
    int price;
    static int itemNumber = 0;

    Item(String code){
        itemNumber++;
        this.num = itemNumber;
        this.code = code;
    }
    void read(Scanner scanner){
        name = scanner.next();
        price = scanner.nextInt();
    }
    void print(){
        System.out.printf("[%d] %s %s (%d원)\n", num, code, name, price);
    }

    boolean matches(String kwd){
        if ((""+num).equals(kwd))
            return true;
        if (code.equals(kwd))
            return true;
        if (name.contains(kwd))
            return true;
        return false;
    }
}
