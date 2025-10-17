package 이중반복문;
// 2중 for문은 for문 내에 for 문이 존재

import java.util.Scanner;

public class DoubleForMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("정수 입력 : ");
//        int num = sc.nextInt();  // 스캐너 객체를 통해 정수를 입력 받음
//        for (int i = 0; i < num; i++) {
//            System.out.print("[i=" + i + "] ");
//            for (int j = 0; j < num; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // 2중 for문을 이용해서 구구단 2단 ~ 9단까지 출력하기
//        for (int i = 2; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.printf("%d x %d = %d\n", i, j , i * j);
//            }
//            System.out.println();
//        }

        // 별찍기 : 5
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
