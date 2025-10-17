package 매쓰응용문제;
// 1. 주사위 두 개 굴리기
// - 두 주사위의 값을 출력
// - 합계를 출력
// - 두 주사위의 같은 수면 "더블!" 문구 출력

// 2. 절대값 계산기
// - Scanner로 정수 두 개 입력받기
// - 두 수의 차이를 절대값으로 출력 => "두 주의 차이는 XX 입니다."

// 점수 반올림 프로그램
// - 실수형으로 점수를 입력 받음
// - 입력 받은 점수를 내림, 올림, 반올림한 점수 출력

import java.util.Scanner;

public class MathExMain {
    public static void main(String[] args) {
        // 1. 주사위 두 개 굴리기
        while (true) {
            int rand1 = (int)(Math.random() * 6) + 1;
            int rand2 = (int)(Math.random() * 6) + 1;
            System.out.println("첫 번째 주사위: " + rand1 + ", 두 번째 주사위: " + rand2);
            System.out.println("합계 : " + (rand1 + rand1));
            if(rand1 == rand2) {
                System.out.println("더블!");
                break;
            }
        }
        // 2. 절대값 계산기
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int num2 = sc.nextInt();

        int diff = Math.abs(num1 - num2);
        System.out.println("두 수의 차는 " + diff + "입니다.");

        // 점수 반올림 프로그램, 반올림의 경우 소수점 3번째 자리를 반올림해 소수점 2번째 자리 만들기
        System.out.print("점수를 입력 하세요(실수) : ");
        double score = sc.nextDouble();
        System.out.println("내림(floor): " + Math.floor(score));
        System.out.println("올림(ceil) : " + Math.ceil(score));
        System.out.println("반올림(round): " + Math.round(score));
        // 수학적인 연산을 총해서 구하기
        System.out.println("소수점 두번째 자리 출력 : " + Math.round(score * 100) / 100.0);
        // 서식지정자를 사용하는 방법
        System.out.printf("소수점 두번째 자리 출력 : %.2f\n", score);

    }
}
