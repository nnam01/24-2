package week4.hw;

import week4.Lecture;
import week4.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Item> itemArrayList = new ArrayList<>();
    ArrayList<User> userArrayList = new ArrayList<>();

    void myMain(){
        readAllItems();
        printAllItems();
        readAllUsers();
        printAllUsers();
    }

    void readAllItems() {
        Item i = null;
        String code;
        while (true) {
            code = scanner.next();
            if (code.equals("0")) break;
            i = new Item(code);
            i.read(scanner);
        }
    }
    void readAllUsers(){
        User u = null;
        String name;
        while (true) {
            name = scanner.next();
            if (name.equals("0")) break;
            u = new User(name);
            u.read(scanner,this);
        }
    }
    void printAllItems(){
        for (Item i : itemArrayList) {
            i.print();
        }
    }
    void printAllUsers(){
        for (User u : userArrayList) {
            u.print();
        }
    }
    Item findItem(int num){
        for (Item item: itemArrayList){
            if(item.num == num)
                return item;
        }
        return null;
    }

    public static void main(String[] args) {
        Store store = new Store();
        store.myMain();
    }
}
