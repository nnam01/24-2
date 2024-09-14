//package week2;
//
//import java.util.Scanner;
//public class StringTest {
//    Scanner scanner = new Scanner(System.in);
//    String[] strArray;
//    void mymain() {
//        int size = scanner.nextInt();
//        strArray = new String[size];
//        for(int i=0; i<size; i++){
//            strArray[i] = scanner.next();
//        }
//        String maxLengthStr="";
//        for (int i=0; i<size; i++) {
//            System.out.println(strArray[i] + "\t길이:" + strArray[i].length());
//            if (maxLengthStr.length() < strArray[i].length())
//                maxLengthStr = strArray[i];
//        }
//        System.out.println("제일 긴 스트링:"+maxLengthStr);
//    }
//
//    public static void main(String[] args) {
//        StringTest my = new StringTest();
//        my.mymain();
//    }
//}