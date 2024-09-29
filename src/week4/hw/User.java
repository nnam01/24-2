package week4.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    String name;
    String pwd;
    int point = 0;
    int total = 0;


    ArrayList<Item> basket = new ArrayList<>();

    User(String name){
        this.name = name;
    }
    void read(Scanner scanner, Store store){
        pwd= scanner.next();
        point = scanner.nextInt();
        int x = -1;
        Item i = null;
        while(true){
            x = scanner.nextInt();
            if(x==0) break;
            i = store.findItem(x);
            if(i!=null) {
                total = total+i.price;
                point = point+(int) (i.price * 0.01);
            }
            basket.add(i);
        }
    }
    void print(){
        System.out.printf("[%s] 총구매 %d건 %d원 (%d점)\n\t", name, basket.size(), total, point );
        for (int a = 0; a < basket.size(); a++) {
            System.out.print(basket.get(a).name+" ");
        }
        System.out.println();
    }
    boolean equalName(String kwd){
        return name.equals(kwd);
    }

    boolean matches(String kwd) {
        for (Item item : basket) {
            if (item.code.equals(kwd) || ("" + item.num).equals(kwd)) {
                return true;
            }
        }
        return false;
    }
}
