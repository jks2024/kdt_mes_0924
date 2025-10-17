package 열거클래스;
// 열거 타입 : 한정된 상수 집합을 정의 할 수 있는 참조 타입
// - 비교 시 값 뿐만 아이라 타입도 검사
// - 기존의 public static final 상수를 대체하기도

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnumMain {
    public static void main(String[] args) {
        // 스캐너로 개발자 5명에 대해서 정보를 입력 받아 한번에 출력 하기
        List<Developer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("[" + (i + 1) + "번째 개발자 입력]");
            System.out.print("이름 : ");
            String name = sc.nextLine();

            // 개발 업무 선택: [1]FRONTEND [2]BACKEND [3]FULLSTACK [4]MOBILE [5]AI
            System.out.print("개발 업무 선택: [1]FRONTEND [2]BACKEND [3]FULLSTACK [4]MOBILE [5]AI : ");
            int in = sc.nextInt();
            DevType type = null;
            switch (in) {
                case 1: type = DevType.FRONTEND; break;
                case 2: type = DevType.BACKEND; break;
                case 3: type = DevType.FULLSTACK; break;
                case 4: type = DevType.MOBILE; break;
                case 5: type = DevType.AI; break;
                default: System.out.println("업무를 잘 못 선택 하였습니다.");
            }

            // 경력 입력: [1]JUNIOR [2]SENIOR
            System.out.print("[1]JUNIOR [2]SENIOR : ");
            int inCareer = sc.nextInt();
            Career career = null;
            if(inCareer == 1) career = Career.JUNIOR;
            else career = Career.SENIOR;

            // 성별 입력: [1]MALE [2]FEMALE
            System.out.print("[1]MALE [2]FEMALE : ");
            int inGender = sc.nextInt();
            Gender gender = null;
            if (inGender == 1) gender = Gender.MALE;
            else gender = Gender.FEMALE;
            sc.nextLine();
            list.add(new Developer(name, type, career, gender));
        }

        // 개발자 목록 출력
        System.out.println("=".repeat(10) + "개발자 목록" + "=".repeat(10));
        for(Developer dev : list) {
            System.out.println(dev);
            System.out.println("-".repeat(30));
        }
    }
}
