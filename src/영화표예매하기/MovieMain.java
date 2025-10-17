package 영화표예매하기;

// 메뉴: [1] 예매하기 [2] 취소하기 [3] 종료하기

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        // TODO: 좌석당 가격을 생성자로 전달해서 객체 생성
        MovieTicket movieTicket = new MovieTicket(12000);

        // TODO: 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // TODO: while 반복문 생성 (1] 예매하기 [2] 취소하기 [3] 종료하기)
        while (true) {
            System.out.println("=".repeat(8) + "영화표 예매 하기" + "=".repeat(8));
            System.out.println("[1] 예매하기");
            System.out.println("[2] 취소하기");
            System.out.println("[3] 종료하기");
            System.out.print("메뉴 선택 : ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1: movieTicket.selectSeat(); break;
                case 2: movieTicket.cancelSeat(); break;
                case 3: System.out.println("총 판매 금액 : " + movieTicket.totalAmount() + "원"); return;
                default: System.out.println("메뉴 선택이 잘 못 되었습니다.");
            }
        }
    }
}
