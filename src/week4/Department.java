package week4;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> stList = new ArrayList<>();
//    ArrayList<Team> teamList = new ArrayList<>();
    ArrayList<Lecture> lecList = new ArrayList<>();
    void mymain() {
        readAllLectures();
        readAllStudents();
        printAllLectures();
        printAllStudents();
    }

    private void readAllLectures() {
        Lecture l = null;
        String code;
        while(true){
            code= scanner.next();
            if(code.equals("end"))break;
            l = new Lecture(code);
            l.read(scanner);
            lecList.add(l);

        }
    }

    private void printAllLectures() {
        for (Lecture lecture: lecList) {
            lecture.print();
            System.out.println();
        }
    }

    Lecture findLecture(String code) {
        for (Lecture lecture : lecList) {
            if (lecture.code.equals(code)) {
                return lecture;
            }
        }
        return null;
    }



//    private void readAllTeams() {
//        Team t = null;
//        String name;
//        while (true){
//            name = scanner.next();
//            if (name.equals("0")) break;
//            t = new Team(name);
//            t.read(scanner, this);
//            teamList.add(t);
//        }
//    }
//
//
//
//
//    private void printAllTeams() {
//        for (Team t : teamList){
//            System.out.print(t.name+": ");
//            t.print(this);
//            System.out.println();
//        }
//    }


    void readAllStudents() {
        Student st = null;
        int id;
        while (true) {
            id = scanner.nextInt();
            if (id==0) break;
            st = new Student(id);
            st.read(scanner, this);
            stList.add(st);
        }
    }

    void printAllStudents(){
        for (Student s : stList) {
            s.print();
        }
    }

    public static void main(String[] args) {
        Department my = new Department();
        my.mymain();
    }

    Student findStudent(int studentNumber) {
        if (studentNumber <= 0 ||studentNumber > stList.size())
            return null;
        return stList.get(studentNumber-1);
    }
}