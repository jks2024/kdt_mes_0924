package for실습;
// 입력 받은 수의 범위 내의 짝수의 합 구하기 (입력받은 수 포함)

import java.util.Scanner;

public class ForExMain {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        // 합을 저장할 변수 생성 (초기화 필요)
        int total = 0;
        // 범위 기반 반복문 생성
        for (int i = 1; i <= num; i++) {
            // 짝수 판별 조건 추가
            if (i % 2 == 0) {  // 짝수인 조건
                total += i;
            }
        }
        System.out.println(total);


        // 실습 문제 2번
        // 입력 받은 수의 범위 내의 5의 배수를 출력 하기, 한줄에 10개씩 출력
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0) {  // 5의 배수인 조건
                System.out.printf("%5d", i);
                cnt++;
                if (cnt == 10) {
                    System.out.println();
                    cnt = 0;
                }
            }
        }
        System.out.println();


        // 실습 문제 3번
        // 정수를 입력 받아 입력 받은 정수 * 정수 크기의 행렬을 출력하는 프로그램 작성
        // 입력 : 4
        //  1  2  3  4
        //  5  6  7  8
        //  9 10 11 12
        // 13 14 15 16
        for (int i = 1; i <= num * num; i++) {  // 출력 범위
            System.out.printf("%5d", i);   // 출력 간격 유지
            if (i % num == 0) System.out.println();
        }
        System.out.println();
    }
}
