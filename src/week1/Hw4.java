package week1;

import java.util.Scanner;

public class Hw4 {
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
            //x는 현재 줄
            for(int x=1; x<=i; x++){
                //공백 반복문
                for(int y= i-x; y>0; y--)
                    System.out.print(" ");
                //별 반복문
                for(int z = 2*x-1; z>0; z--)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}