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
        while( x!=0 ){
            x = scanner.nextInt();
            i = store.findItem(x);
            if(i!=null) {
                total = +i.price;
                point = +(int) (i.price * 0.1);
            }
            basket.add(i);
        }
    }
    void print(){
        System.out.printf("[%s] 총구매 %d건 %d원 (%d점)\n\t", name, basket.size(), total, point );
        for (int a = 0; a < basket.size(); a++) {
            System.out.print(basket.indexOf(a)+" ");
        }
        System.out.println();
    }
    //[lee] 총구매 4건 4830원 (47점)
    // 델리투명자  비비드스프링노트  아트인덱스노트  돌돌이자
    void matches(){

    }
}
