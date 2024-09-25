package week3;

import java.util.Random;
import java.util.Scanner;
public class Student {
    static Random rand = new Random();
    int id;
    String name;
    int year;
    String phone;
    int score;

    Student(int id){
        this.id=id;
    }
    void read(Scanner scan) {
        name = scan.next();
        year = scan.nextInt();
        phone = scan.next();
        score = scan.nextInt();
    }

    void print() {
        System.out.printf("%d %s(%d학년) %s - %d점\n", id, name, year, phone, score);
    }

    boolean match(String kwd){
        return name.equals(kwd);
    }

    boolean matches(String kwd) {
        if (name.equals(kwd))
            return true;
        if ((""+year).equals(kwd))
            return true;
        if (kwd.length()>3) {
            if (("" + id).equals(kwd))
                return true;
            if ((phone.equals(kwd)))
                return true;
        }
        return false;
    }

    boolean includeKeyword(String kwd) {
        if (name.contains(kwd))
            return true;
        if (kwd.length()>3) {
            if (("" + id).contains(kwd))
                return true;
            if (phone.contains(kwd))
                return true;
        }
        return false;
    }

    boolean scoreMatch(int low, int high){
        return score >= low && score < high;
    }

}

