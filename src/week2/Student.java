package week2;

import java.util.Scanner;
public class Student {
    static int Steps[] = {90,80,70,60,0};
    static char Grade[] = {'A','B','C','D','F'};

    String id;
    String name;
    int year;
    int score[] = new int[3];
    char grade[] = new char[3];
    void read(Scanner scan) {
        id = scan.next();
        name = scan.next();
        year = scan.nextInt();
        for (int k = 0; k < 3; k++) {
            score[k] = scan.nextInt();
            grade[k] = defineGrade(score[k]);
        }
    }
    char defineGrade(int score){
        char grade = 'F';
        for (int i = 0; i < Steps.length; i++) {
            if (score >= Steps[i]) {
                grade = Grade[i];
                break;
            }
        }
        return grade;
    }

    void printScoreAndGrade(){
        for(int i=0; i<3;i++)
            System.out.print(score[i]+"("+grade[i]+")\t");
        System.out.println();
    }
    void print() {
        System.out.printf("%s %s(%d학년)\t", id, name, year);
        printScoreAndGrade();
    }

    void updateScore(int subjectNumber, int newScore) {
        score[subjectNumber] = newScore;
        grade[subjectNumber] = defineGrade(newScore);
    }
    void modifyScore(int subjectNumber, int newScore, int menuChoice) {
        if (menuChoice == 1) {
            updateScore(subjectNumber, newScore);
        } else if (menuChoice == 2){
            if (newScore > score[subjectNumber]) {
                updateScore(subjectNumber, newScore);
            }
        }
    }
}
