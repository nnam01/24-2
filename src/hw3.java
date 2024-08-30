import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i= 0;
        while(true){
            System.out.print("크기를 입력하세요...");
            i = scanner.nextInt();
            //0이면 탈출
            if(i==0) {
                System.out.println("안녕히 가세요");
                break;
            }

            for(int x = 0; x<i; x++){
                for(int y = 0; y<i; y++){
                    if(x==0||x==i-1) {
                        System.out.print("*");
                    } else {
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
