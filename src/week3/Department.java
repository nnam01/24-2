package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> stList = new ArrayList<>();
    void mymain() {
        readAll();
        printAll();
        searchMode();
    }

    void searchMode() {
        while(true) {
            System.out.print("(1) 전체출력 (2) 이름검색 (3) 통합검색 (4) 점수검색 (5) 종료   ");
            int choice = scanner.nextInt();
            if(choice==1){
                printAll();
            } else if (choice==2) {
                printSearchName(scanner);
            } else if (choice==3) {
                printAllSearch(scanner);
            } else if (choice==4) {
                printScoreSearch(scanner);
            } else if (choice==5) {
                System.out.println("종료합니다.");
                break;
            }
        }
    }
    void printSearchName(Scanner scanner){
        System.out.print("이름: ");
        String kwd = scanner.next();
        boolean found = false;
        for (Student st : stList)
            if (st.match(kwd)) {
                st.print();
                found = true;
            }
        if (!found) {
            System.out.println("없음");
        }
    }

    void printAllSearch(Scanner scanner) {
        System.out.print("통합검색 키워드: ");
        String kwd = scanner.next();
        for (Student st : stList)
            if (st.matches(kwd) || st.includeKeyword(kwd)) {
                st.print();
            }
    }

    void printScoreSearch(Scanner scanner){
        System.out.print("점수 검색 범위: ");
        String low = scanner.next();
        String high = scanner.next();
        if (low.equals("-"))
            low ="0";
        if (high.equals("-"))
            high = "101";

        boolean found = false;
        for (Student st : stList)
            if (st.scoreMatch( Integer.parseInt(low),  Integer.parseInt(high))) {
                st.print();
                found = true;
            }
        if (!found) {
            System.out.println("없음");
        }
    }

    void readAll() {
        Student st = null;
        int id;
        while (true) {
            id = scanner.nextInt();
            if (id==0) break;
            st = new Student(id);
            st.read(scanner);
            stList.add(st);
        }
    }

    void printAll(){
        for (Student s : stList) {
            s.print();
        }
    }

    public static void main(String[] args) {
        Department my = new Department();
        my.mymain();
    }
}