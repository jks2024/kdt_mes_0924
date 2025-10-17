package 문자열실습;
// 실습문제 1: Knuth-Morris-Pratt => KMP, Korea-Standard => KS,

import java.util.Scanner;

public class StringExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String name = sc.next();

        // 실습문제 1 :
        // [1]대문자만 골라내는 방법, charAt()
        for(int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') System.out.print(name.charAt(i));
        }
        System.out.println();

        // [2]문자열의 0번째 인덱스 출력하고, '-'다음에 오는 문자 출력
        for(int i = 0; i < name.length(); i++) {
            if(i == 0) System.out.print(name.charAt(0));
            else if(name.charAt(i) =='-') System.out.print(name.charAt(i+1));
        }
        System.out.println();

        // [3]"-" 기준 split로 자르고, 0번째 인덱스 출력
        String[] strArr = name.split("-"); // 문자열을 "-" 기준으로 잘라서 문자열 배열로 만듬
        for (String e : strArr) System.out.print(e.charAt(0));
        System.out.println();

        // [4]문자열을 문자 배열로 변경하고, 향상된 for문으로 순회하면 해당 문자가 대문자 구간이면 출력
        char[] chArr = name.toCharArray();  // 문자열을 문자 배열로 변환
        for (char e : chArr) {
            if (e >= 'A' && e <= 'Z') System.out.print(e);
        }
        System.out.println();


        // 입력 받은 문자열에서 대문자는 소문자, 소문자는 대문자 변환
        // AbCd => aBcD
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) < 'a') System.out.print((char)(name.charAt(i) + ('a' - 'A')));
            else System.out.print((char)(name.charAt(i) - ('a' - 'A')));
        }
        System.out.println();

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) < 'a') System.out.print(Character.toLowerCase(name.charAt(i)));
            else System.out.print(Character.toUpperCase(name.charAt(i)));
        }
        System.out.println();


        // 입력 받은 문자열을 반대로 출력하기
        // ABCD => DCBA
        // 시작값이 배열의 크기에서 - 1
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();

    }
}
