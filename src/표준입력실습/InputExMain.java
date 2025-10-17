package 표준입력실습;

import java.util.Scanner;

// 이름(next()), 전화번호(next()), 주소(nextLine()), 성별(char), 나이(int), 직업(문자열)을 입력 받아 이쁘게 출력하기
// 성별은 'M' 또는 'F'로 입력 받아 출력시 남성과 여성으로 출력
// 스캐너 연속 입력 시 버퍼 비우기 필요 할 수 있음 : sc.nextLine()
public class InputExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 스캐너 객체 생성
        System.out.print("이름 입력 : ");  // 줄바꿈 없음
        String name = sc.next();
        sc.nextLine();

        System.out.print("전화번호 입력 : ");
        String phone = sc.next();
        sc.nextLine();

        System.out.print("주소 입력 : ");
        String addr = sc.nextLine();

        System.out.print("성별 입력 : ");
        char gender = sc.next().charAt(0);   // 문자열에서 0번째 문자 추출

        System.out.print("나이 입력 : ");
        int age = sc.nextInt();

        System.out.print("직업 입력 : ");
        String job = sc.next();

        System.out.println("=".repeat(10) + "회원 정보 출력" + "=".repeat(10));
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phone);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + ((gender == 'M') ? "남성" : "여성"));
        System.out.println("나이 : " + age);
        System.out.println("직업 : " + job);
    }
}
