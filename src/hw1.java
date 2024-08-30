import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i= 0;
        while(i != -1){
            System.out.print("크기를 입력하세요...");
            i = scanner.nextInt();
            for(int x = 0; x<i; x++){
                for(int y = 0; y<i; y++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}
