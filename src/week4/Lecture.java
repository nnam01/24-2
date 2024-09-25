package week4;

import java.util.Scanner;

public class Lecture {
    String code;
    String lectureName;
    int year;
    String day;
    String time;

    Lecture (String code){
        this.code = code;
    }

    void read(Scanner scanner) {
        lectureName = scanner.next();
        year = scanner.nextInt();
        day = scanner.next();
        time = scanner.next();
    }
    void print() {
        System.out.printf("[%s] %s %d학년 (%s요일 %s)", code, lectureName, year, day, time);
    }

    void match() {

    }
}
