package 집주소;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeExMain {
    public static void main(String[] args) {
        int[] numSize = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3}; // 각 숫자의 크기
        List<Integer> result = new ArrayList<>(); // 결과를 담을 리스트
        Scanner sc = new Scanner(System.in); // 입력을 받기위해 스캐너 객체 생성
        while (true) { // 무한 반복, 반드시 탈출 조건이 있어야 함
            int sum = 0;  // 입력된 숫자 여백을 누적하기 위한 변수
            String number = sc.next();  // 문자열로 입력 받음
            if(number.equals("0")) break;  // 탈출 조건
            for (int i = 0; i < number.length(); i++) {  // 입력받은 문자열을 길이 만큼 반복
                sum += numSize[number.charAt(i) - '0'] + 1; // +1 숫자 사이의 여백
            }
            result.add(sum + 1); // 맨앞의 공백 계산
        }
        for (int e : result) System.out.println(e);
    }
}
