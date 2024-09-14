package week1;

import java.util.Scanner;

public class MyMain_1_HW {
    Scanner scanner = new Scanner(System.in);

    void mymain() {
        int size;
        while (true) {
            System.out.print("크기를 입력하세요...");
            size = scanner.nextInt();
            if (size == 0)
                break;
            drawFillBox(size);
            System.out.println();
            drawABox(size);
            System.out.println();
            drawTriangle(size);
            System.out.println();
            challengeA(size);
        }
        System.out.println("안녕히 가세요.");
        System.out.println();
    }

    void drawSolidLine(int size) {
        for (int i=0; i<size; i++)
            System.out.print("*");
        System.out.println();
    }
    void drawBlankN (int n){
        for (int i=0; i<n; i++)
            System.out.print(" ");
    }

    void drawBlankLine ( int size ) {
        System.out.print("*");
        drawBlankN(size - 2);
        System.out.println("*");
    }
    // step 1
    void drawFillBox ( int size ){
        for (int i=0; i<size; i++) {
            drawSolidLine(size);
        }
    }
    // step 3
    void drawABox ( int size ){
        drawSolidLine(size);
        for (int i=0; i<size-2;i++)
            drawBlankLine(size);
        drawSolidLine(size);
    }
    // step 4
    void drawTriangle ( int size ){
        for(int i=1; i<=size; i++){
            drawBlankN(size-i);
            drawSolidLine(2*i-1);
        }
    }
    // step 5
    void challengeA ( int size ){
        System.out.println("메세지를 입력하세요");
        String msg = scanner.next();
        drawMsgBox(size,msg);
    }// 단어 입력 및 drawMsgBox 호출

    void drawMsgLine ( int size, String msg ){
        System.out.print("*");
        drawBlankN( (size-2-msg.length())/2);
        System.out.print(msg);
        drawBlankN( size - 2 - msg.length() - (size-2-msg.length())/2);
        System.out.println("*");
    }

    void drawMsgBox ( int size, String msg){
        drawSolidLine(size);
        int spaceTop = (size - 3) / 2;
        for (int i = 0; i<size-2; i++){
            if( i == spaceTop)
                drawMsgLine(size, msg);
            else
                drawBlankLine(size);
        }
        drawSolidLine(size);
    }

    public static void main (String args[]){
        MyMain_1_HW my = new MyMain_1_HW();
        my.mymain();
    }
}