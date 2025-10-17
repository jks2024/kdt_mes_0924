package 조건문;
// 제어문 : 프로그램이 원하는 결과를 얻기 위해 프로그램의 흐름을 제어 하는 것
// 조건문 : 주어진 조건식에 따라 조건을 분기 하는 것
// 반복문 : 주어진 조건이 참인동안 반복 수행

import java.util.Scanner;

public class ConditionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 이름을 입력 받음
        System.out.print("이름 입력 : ");
        String name = sc.next();

        int kor, eng, mat;
        // 국어, 영어, 수학 성적이, 0 미만이거아 100초과이면 재 입력 요구 후 정상작이 입력되면 다음 루틴 수행
        while (true) {
            System.out.print("국어 성적 (0 ~ 100) : ");
            kor = sc.nextInt();
            if (kor >= 0 && kor <= 100) break;
            System.out.println("국어 성적 입력 오류!!!!");
        }
        while (true) {
            System.out.print("영어 성적 (0 ~ 100) : ");
            eng = sc.nextInt();
            if (eng >= 0 && eng <= 100) break;
            System.out.println("영어 성적 입력 오류!!!!");
        }
        while (true) {
            System.out.print("수학 성적 (0 ~ 100) : ");
            mat = sc.nextInt();
            if (mat >= 0 && mat <= 100) break;
            System.out.println("수학 성적 입력 오류!!!!");
        }

        // 정상적인 입력이면 총점과 평균을 구하고
        int total = kor + eng + mat;
        double avg = (double) total / 3;
        if (avg >= 90) System.out.printf("%s, %d, %.2f, A\n", name, total, avg);
        else if (avg >= 80) System.out.printf("%s, %d, %.2f, B\n", name, total, avg);
        else if (avg >= 70) System.out.printf("%s, %d, %.2f, C\n", name, total, avg);
        else if (avg >= 60) System.out.printf("%s, %d, %.2f, D\n", name, total, avg);
        else System.out.printf("%s, %d, %.2f, F\n", name, total, avg);
    }
}
