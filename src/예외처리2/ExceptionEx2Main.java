package 예외처리2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rst = 0;
        while (true) {
            System.out.print("두개의 정수 입력 : ");
            try {
                int a = sc.nextInt();
                int b = sc.nextInt();
                rst = a / b;
                break;
            } catch (ArithmeticException e) {
                System.out.println("나눗셈 오류 : " + e);
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력 하세요 : " + e);
                sc.nextLine();
            }
        }
        System.out.println("결과 : " + rst);

    }
}
