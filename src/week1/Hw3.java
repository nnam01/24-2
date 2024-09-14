package week1;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        while(true){
            System.out.print("크기를 입력하세요...");
            i = scanner.nextInt();

            if(i==0) {
                System.out.println("안녕히 가세요");
                break;
            }

            for(int x = 0; x<i; x++){
                for(int y = 0; y<i; y++){
                    //첫줄과 끝줄이라면
                    if(x==0||x==i-1) {
                        System.out.print("*");
                    } else {
                        //중간 줄이면서, 줄의 시작과 끝이라면
                        if(y==0||y==i-1){
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
