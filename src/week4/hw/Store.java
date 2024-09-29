package week4.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Item> itemArrayList = new ArrayList<>();
    ArrayList<User> userArrayList = new ArrayList<>();

    void myMain(){
        readAllItems();
        readAllUsers();
        printMenu();
    }

    void printMenu(){
        int choice;
        while (true) {
            System.out.print("(1) 상품출력(2) 사용자출력 (3) 상품검색 (4) 사용자검색\n" +
                    "(5) 상품으로사용자검색 (6) 상품별판매현황 (7) 같이판매된상품\n" +
                    "(0) 종료=> ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printAllItems();
                    break;
                case 2:
                    printAllUsers();
                    break;
                case 3:
                    searchItem();
                    break;
                case 4:
                    findUser();
                    break;
                case 5:
                    searchUser();
                    break;
                case 6:
                    printSalesStatus();
                    break;
                case 7:
                    printRelatedProducts();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("잘못된 값입니다.");
            }
            System.out.println();
        }
    }

    void printRelatedProducts() {
    }

    void printSalesStatus() {
        System.out.print("상품별 판매 수, 몇개 이상: ");
        int count = scanner.nextInt();
        for (User user:userArrayList){

        }
    }

    void searchItem(){
        System.out.print("상품검색 키워드: ");
        String kwd = scanner.next();
        for (Item item: itemArrayList)
            if( item.matches(kwd)) {
                item.print();
            }
    }
    void findUser(){
        System.out.print("사용자 검색 키워드: ");
        String kwd = scanner.next();
        for (User user: userArrayList)
            if( user.equalName(kwd)){
                user.print();
        }
    }

    void searchUser(){
        System.out.print("구매한 사용자 검색할 상품번호 또는 코드: ");
        String kwd = scanner.next();
        for (User user : userArrayList) {
            if (user.matches(kwd)) {
                user.print();
            }
        }
    }
    void readAllItems() {
        Item i = null;
        String code;
        while (true) {
            code = scanner.next();
            if (code.equals("0")) break;
            i = new Item(code);
            i.read(scanner);
            itemArrayList.add(i);
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
            userArrayList.add(u);
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
