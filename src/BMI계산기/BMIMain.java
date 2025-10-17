package BMI계산기;

import java.util.Scanner;

public class BMIMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 키(cm)
        System.out.print("키(cm)를 입력 하세요 : ");
        int height = sc.nextInt();

        // 몸무게(kg)
        System.out.print("몸무게(kg)를 입력 하세요 : ");
        double weight = sc.nextDouble();

        // BMI 계산
        double mHeight = height / 100.0;
        double bmi = weight / (mHeight * mHeight);

        // BMI 값 출력
        System.out.printf("당신의 BMI는 %.2f 입니다.\n", bmi);

        // BMI 분류 출력
        if (bmi < 18.5) System.out.println("저체중 입니다.");
        else if (bmi < 23) System.out.println("정상 체중 입니다.");
        else if (bmi < 25) System.out.println("과체중 입니다.");
        else System.out.println("비만 입니다.");


    }
}
