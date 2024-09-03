import java.util.Scanner;

public class hw5 {

    void printStar(int i){
        for(int x=0; x<i; x++)
            System.out.print("*");
        System.out.println();
    }

    void printLine(int i){
        for(int x= 0; x<i; x++){
            if(x==0|| x== i-1)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }

    void printSpace(int i){
        for(int x= 0; x<i; x++)
            System.out.print(" ");
    }

    public static void main(String[] args) {
        hw5 hw5 = new hw5();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("크기를 입력하세요...");
            int size = scanner.nextInt();
            if (size <3) {
                System.out.println("크기가 너무작습니다.");
                break;
            }

            System.out.print("단어를 입력하세요...");
            String msg = scanner.next();
            hw5.printStar(size);
            for (int x = 1; x<size-1; x++) {
                if(x==(size-3)/2+1) {
                    System.out.print("*");
                    hw5.printSpace( (size-2-msg.length())/2);
                    System.out.print(msg);
                    hw5.printSpace( size - 2 - msg.length() - (size-2-msg.length())/2);
                    System.out.println("*");
                }
                else hw5.printLine(size);
            }
            hw5.printStar(size);
        }
    }
}