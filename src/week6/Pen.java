package week6;

import java.util.Scanner;

public class Pen implements Manageable {
    String itemName;
    float mmThick;
    int price;
    public void read(Scanner scan) {
        itemName = scan.next();
        mmThick = scan.nextFloat();
        price = scan.nextInt();
    }
    public void print() {
        System.out.printf("%s %.2fmm %d원\n", itemName, mmThick, price);
    }
    public boolean matches(String kwd) {
        if (itemName.equals(kwd))
            return true;
        if ((mmThick+"").contains(kwd))
            return true;
        return false;
    }

}
