//package week4;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Team {
//    String name;
//    ArrayList<Integer> members = new ArrayList<>();
//
//    Team(String name) {
//        this.name = name;
//    }
//
//    void read(Scanner scan, Department department) {
//        int studentNumber = 0;
//        Student st = null;
//        while (true) {
//            studentNumber = scan.nextInt();
//            if (studentNumber == 0)
//                break;
//            st = department.findStudent(studentNumber);
//            members.add(studentNumber);
//            st.setTeam(this);
//        }
//    }
//    void print(Department dept) {
//        for (int a: members) {
//            Student st = dept.findStudent(a);
//            st.printName();
//        }
//    }
//}