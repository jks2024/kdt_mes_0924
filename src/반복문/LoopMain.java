package 반복문;
// 반복문 : 주어진 조건이 참인 경우 또는 주어진 횟수 만큼 반복 수행
// while 문 : 정해진 횟수를 알 수 없을 때 주로 사용
// do ~ while 문 : 선 수행 후 조건 비교, 거의 사용 안함
// for 문 : 정해진 횟수를 반복 할 때
// Enhanced for : 이터러블(반복 가능한 객체)객체를 간편하게 순회할 때 사용

import java.util.Scanner;

public class LoopMain {
    public static void main(String[] args) {
        // 나이를 입력 받는데 0 ~ 199살 사이는 정상 입력, 다른 값은 재 입력 요구~~
        Scanner sc = new Scanner(System.in);
        int age;

        do {
            System.out.print("나이를 입력 하세요 : ");
            age = sc.nextInt();
        } while(age <= 0 || age >= 200);

        System.out.println("당신의 나이는 " + age + "입니다.");
    }
}
