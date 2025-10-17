package 배열실습;
// 평균점수 구하기
// 수강생이 5명, 각 학생의 점수 40점 미만이면 보충학습을 듣는 조건으로 40점으로 변경
// 55, 65, 30, 45, 25  => 55, 65, 40, 45, 40

import java.util.Scanner;

public class ArrayExMain {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        // 5명 학생의 성적으로 저장하는 배열 생성
        // 5명의 성적을 입력 받기 (배열)
        // 40점 미만의 성적은 40점으로 변경해서 평균 구하기
//        Scanner sc = new Scanner(System.in);
//        int[] scores = new int[5];  // 5명의 성적을 입력 받이 위한 배열 생성
//        int total = 0;
//        System.out.print("성적 입력 : ");
//        for(int i = 0; i < scores.length; i++) {
//            scores[i] = sc.nextInt(); // 성적을 입력 받아 배열에 대입
//            if(scores[i] < 40) scores[i] = 40;
//            total += scores[i];
//        }
//        System.out.printf("평균 : %.2f\n", (double)total / scores.length);



        // 실습 문제 2번
        // 7자리의 로또 번호 생성하기(배열과 Math.random() 사용)
        // 1 ~ 45 사이의 임의의 수 7개를 생성해 배열에 저장하기
        // 중복 제거 (추가 사항)
        int[] lotto = new int[7];
        int rand; // 로또 번호 생성용 변수
        int index = 0; // 중복 제거를 위한 index 계산
        boolean isExist = false; // 중복 여부에 대한 flag
        while (true) {  // 횟수를 알 수 없을 때 사용
            rand = (int) (Math.random() * 45) + 1;
            for (int i = 0; i < 7; i++) {  // 배열을 순회하면서 중복값 여부를 체크
                if(lotto[i] == rand) isExist = true;  // 배열내에 현재 생성한 번호가 포함되어 있으면 flag를 true로 변경
            }
            if(!isExist) lotto[index++] = rand;  // 해당 인덱스에 생성된 로또 번호를 대입 후 증가
            if (index == 7) break;
            isExist = false;  // 다시 flag를 초기화
        }
        for (int e : lotto) System.out.print(e + " ");
        System.out.println();

    }
}
