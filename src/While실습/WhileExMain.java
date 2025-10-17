package While실습;
// 두개의 주사위를 던져 같은 수가 나오면 값을 보여 주고 무인도 탈출
// 몇번만에 탈출에 성공했는지 보여 주기
// Math.random() : 0 ~ 1 미만의 무작위 실수값 생성, 0.0001 ~ 0.9999
// int val = (int) (Math.random() * 6) + 1

public class WhileExMain {
    public static void main(String[] args) {
        int rand1, rand2, cnt = 0;
        while (true) {
            cnt++; // 탈출 횟수를 구하기 위해서
            rand1 = (int) (Math.random() * 6) + 1;  // 1 ~ 6사이의 임의의 값 생성
            rand2 = (int) (Math.random() * 6) + 1;
            if (rand1 == rand2) {
                System.out.println(rand1 + "과 " + rand2 + "의 값이 같음으로 무인도 탈출 !!!");
                System.out.println("무인도를 " + cnt + "만에 탈출 성공 했습니다.");
                break; // 반복문에 대한 탈출 조건
            }
        }
    }
}