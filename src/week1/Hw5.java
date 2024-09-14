package week1;

import java.util.Scanner;

public class Hw5 {

    void printStar(int size){
        for(int x=0; x<size; x++)
            System.out.print("*");
        System.out.println();
    }

    void printLine(int size){
        for(int x= 0; x<size; x++){
            if(x==0|| x== size-1)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }

    void printSpace(int size){
        for(int x= 0; x<size; x++)
            System.out.print(" ");
    }

    public static void main(String[] args) {
        Hw5 hw5 = new Hw5();
        Scanner scanner = new Scanner(System.in);
        int size;
        String msg;

        while(true){
            System.out.print("크기를 입력하세요...");
            size = scanner.nextInt();
            if (size <3) {
                System.out.println("크기가 너무작습니다.");
                break;
            }

            System.out.print("단어를 입력하세요...");
            msg = scanner.next();

            hw5.printStar(size);
            for (int x = 1; x<size-1; x++) {
                //상단 여백 다음줄이라면, 즉 msg가 들어갈 부분이라면
                if(x==(size-3)/2+1) {
                    System.out.print("*");
                    hw5.printSpace( (size-2-msg.length())/2);
                    System.out.print(msg);
                    hw5.printSpace( size - 2 - msg.length() - (size-2-msg.length())/2);
                    System.out.println("*");
                } else {
                    hw5.printLine(size);
                }
            }
            hw5.printStar(size);
        }
    }
}