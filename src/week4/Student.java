package week4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Student {
    static Random rand = new Random();
    int id;
    String name;
    int year;
    String phone;
    ArrayList<Lecture> registeredList = new ArrayList<>();

//    Team myTeam;

    Student(int id){
        this.id=id;
    }
    void read(Scanner scan, Department department) {
        name = scan.next();
        phone = scan.next();
        year = scan.nextInt();

        String code;
        Lecture lecture = null;
        while (true) {
            code = scan.next();
            if (code.equals("0"))
                break;
            lecture = department.findLecture(code);
            registeredList.add(lecture);
        }
    }

    void print() {
        System.out.printf("%d %s %s (%d학년) ",
                id, name, phone, year);
                System.out.println();
        for (Lecture lecture: registeredList) {
            System.out.print("\t");
            lecture.print();
            System.out.println();
        }
    }

    void printName() { System.out.print(this.name+ " "); }

//    void setTeam(Team t){ myTeam = t;}
}

