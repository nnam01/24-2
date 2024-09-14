package week2;

import java.util.Scanner;
public class Department {
    Scanner scanner = new Scanner(System.in);
    void mymain() {
        Student stList[];
        System.out.print("학생수: ");
        int n = scanner.nextInt();
        stList = new Student[n];
        for (int i = 0; i < n; i++) {
            stList[i] = new Student();
            stList[i].read(scanner);
        }
        for (Student st : stList) {
            st.print();
        }

        while(true){
            System.out.println("계속 하시겠습니까? (y/n)");
            char choice = scanner.next().charAt(0);
            if (choice=='y') {
                IntArray iA = new IntArray(n);
                System.out.print("점수 수정할 과목 번호 (1) 국어 (2) 영어 (3) 수학 ...");
                int subjectNumber = scanner.nextInt();
                System.out.println(n+"명 점수입력...");
                iA.generate();
                iA.print();
                System.out.print("점수 반영하시겠습니까? (y/n)");
                choice = scanner.next().charAt(0);
                if (choice == 'y'){
                    System.out.print("(1) 점수 그대로 반영   (2) 높은 점수 반영 ...");
                    int menuChoice = scanner.nextInt();
                    for(int i=0; i<n;i++){
                        stList[i].modifyScore(subjectNumber, iA.get(i), menuChoice);
                    }
                    for (Student st : stList) {
                        st.print();
                    }
                }
                else if (choice =='n'){
                    System.out.print("메뉴 선택 (1) 점수 조정  (2) 다시 생성  (3) 취소/종료 ...");
                    int menuChoice = scanner.nextInt();
                    if (menuChoice ==1){
                        
                    } else if (menuChoice==2) {
                        
                    } else if (menuChoice==3) {
                        
                    }
                }
            }
            else if (choice == 'n') {
                System.out.println("안녕히가세요");
                break;
            }
        }
    }




    public static void main(String[] args) {
        Department my = new Department();
        my.mymain();
    }
}
