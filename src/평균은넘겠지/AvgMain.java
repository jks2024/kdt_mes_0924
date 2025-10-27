package 평균은넘겠지;

//5
//5 50 50 70 80 100
//7 100 95 90 80 70 60 50
//3 70 90 80
//3 70 90 81
//9 100 99 98 97 96 95 94 93 91

//40.000%
//57.143%
//33.333%
//66.667%
//55.556%

import java.util.Scanner;

public class AvgMain {
    // 입력을 받기 위한 스캐너 생성
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // 테스트 케이스 수 입력 받기
        int cnt = sc.nextInt();
        double[] result = new double[cnt];
        // 각 테스트에 케이스의 결과를 저장할 double type의 배열 생성 (처음에 테스트 케이스 갯수 만큼)
        for (int i = 0; i < cnt; i++) {
            result[i] = overRate();
        }
        // 향상된 for문을 순회 하면서 결과 출력
        for (double e : result) {
            System.out.printf("%.3f%%\n", e);
        }

        sc.close();  // 스캐너 객체 닫기
    }

    // 각 테스트 케이스에서 평균케 넘는 비율을 계산하는 메서드 만들기
    static double overRate() {
        int studentCnt = sc.nextInt();
        int[] score = new int[studentCnt];  // 학생의 수만큼의 성적을 입력 받기 위한 배열
        int total = 0;

        for (int i = 0; i < studentCnt; i++) {
            score[i] = sc.nextInt();  // 학생의 성적을 입력 받음
            total += score[i];  // 평균을 구하기 위해서 값을 누적
        }
        // 평균 구하기
        double avg = (double) total / studentCnt;
        // 평균을 넘는 비율을 구하기위해 숫자 누적하기
        int overCnt = 0;
        for (int e : score) {
            if (e > avg) overCnt++;
        }
        return (double) overCnt / studentCnt * 100; // 백분율로 표시
    }

}
