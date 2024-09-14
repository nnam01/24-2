package week1;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        while (true) {
            System.out.print("크기를 입력하세요...");
            i = scanner.nextInt();
            for (int x = 0; x < i; x++) {
                for (int y = 0; y < i; y++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}
