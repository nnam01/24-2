package week4.hw;

import week4.Lecture;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Item> itemArrayList = new ArrayList<>();
    ArrayList<User> userArrayList = new ArrayList<>();

    void myMain(){
        readAllItems();
        readAllUsers();
        printAllItems();
        printAllUsers();
    }

    void readAllItems(){
        Item i = null;
        String code;
        while(true){
            code= scanner.next();
            if(code.equals("end"))break;
    }
    void readAllUsers(){

    }
    void printAllItems(){

    }
    void printAllUsers(){

    }
}
