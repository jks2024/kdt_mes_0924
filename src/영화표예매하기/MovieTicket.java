package 영화표예매하기;

import java.util.Scanner;

public class MovieTicket {
    // TODO: 좌석 10개 대한 배열 생성, seat의 주소 변경을 막기 위해 final 지정
    private final int[] seat;

    // TODO: 좌석당 가격을 받기위한 인스턴스 필드 생성, 외부에서 생성자를 통해서 주입받은 값이 변경되는 걸 막기 위해 final
    private final int price;

    // TODO: 입력용 스캐너 생성, 대입 받는 스캐너의 주소를 고정하기 위해서 final 사용
    private final Scanner sc;

    // TODO: 생성자를 만들고 가격을 주입(매개변수) 받음
    public MovieTicket(int price) {
        seat = new int[10];  // heap 영역에 배열을 할당하면 자동 초기화 됨 (자바)
        sc = new Scanner(System.in);
        this.price = price;
    }

    // TODO: 좌석 상태를 출력하는 메서드 생성 : 배열의 값이 0이면 [ ], 1이면 [V]
    public void printSeat() {
        for(int e : seat) {  // 향상된 for문으로 이터러블 객체를 자동 순회, e변수는 배열의 실제 값이 복가 됨
            System.out.print((e == 0 ? "[ ]" : "[V]"));
        }
        System.out.println();
    }

    // TODO: 좌석 번호 유효성 체크, 반환값이 boolean 이기 때문에 true, false 값을 반환 됨
    private boolean isValidPos(int searPos) {
        return searPos >= 1 && searPos <= seat.length;
    }

    // TODO: 좌석 예매 메서드 (먼저 좌석 상태 보여 주고, 예매 기능 처리하고, 변경된 좌석 상태를 보여줌)
    public void selectSeat() {
        printSeat();  // 먼저 좌석 상태를 보여 줌
        System.out.print("예매할 좌석 번호(1 ~ 10) : ");
        int seatPos = sc.nextInt();

        // 유효성 검사
        if (!isValidPos(seatPos)) {
            System.out.println("좌석 번호는 1 ~ 10 사이로 입력 하세요.");
        }
        // TODO: 예매 가능 여부를 확인
        if (seat[seatPos - 1] == 0) {  // 배열의 인덱스는 0부터 시작 하기 때문에 입력 받은 값에서 1을 빼줌
            seat[seatPos - 1] = 1;  // 예약된 좌석이므로 1로 변경 해줌
            System.out.println(seatPos + "번 좌석 예매 완료.");
            printSeat(); // 변경된 좌석 상태를 보여 줌
        } else {
            System.out.println("이미 예약된 좌석 입니다. 다른 좌석을 선택하세요.");
        }
    }

    // TODO: 좌석 취소 메서드 (먼저 좌석 상태 보여 주고, 취소 기능 처리하고, 변경된 좌석 상태를 보여줌)
    public void cancelSeat() {
        printSeat();  // 먼저 좌석 상태를 보여 줌
        System.out.print("취소할 좌석 번호(1 ~ 10) : ");
        int seatPos = sc.nextInt();

        // 유효성 검사
        if (!isValidPos(seatPos)) {
            System.out.println("좌석 번호는 1 ~ 10 사이로 입력 하세요.");
        }

        // TODO: 예매 가능 여부를 확인
        if (seat[seatPos - 1] == 1) {  // 배열의 인덱스는 0부터 시작 하기 때문에 입력 받은 값에서 1을 빼줌
            seat[seatPos - 1] = 0;  // 취소 상태인 0으로 변경
            System.out.println(seatPos + "번 좌석 취소 완료.");
            printSeat(); // 변경된 좌석 상태를 보여 줌
        } else {
            System.out.println("해당 좌석은 예매되지 않은 좌석 입니다.");
        }
    }

    // TODO: 종료하기 선택 시 총 매출액 보여 주기
    public int totalAmount() {
        int cnt = 0;  // 예약된 좌석 수를 누적하기 위한 변수
        for (int e : seat) {
            if(e == 1) cnt++;  // 예약된 좌석이면 cnt 값 증가 시킴
        }
        return price * cnt;  // 가격 * 좌석 수
    }
}
