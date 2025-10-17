package 정적맴버;

public class Bank {
    private static int count = 0;  // 클래스 생성시 만들어 짐, 초기값을 직접 대입
    private int account;  // 계좌
    private String bank;  // 은행 이름
    // 생성자는 클래스 이름과 동일하고, 반환 타입이 없음
    public Bank(String name, int account) {
        count++;  // 생성자 호출 시 값이 1씩 증가
        this.account = account;
        this.bank = name;
        System.out.println(name + "은행에 계좌를 개설 합니다. 잔액은 " + account + "원 입니다.");
    }

    // 정적메서드 : 클래스 생성시 만들어지고, 객체 생성 시에는 만들어지지 않음
    public static int getCount() {
        return count;
    }

    // 예금하기 메서드, 매개변수에 final을 붙이면 메서드 내부에서 매개변수의 값이 변경되는걸 막을 수 있음
    public void setDeposit(final int dep) {
        this.account += dep;  // 현재 계좌에 입금 금액을 누적
        System.out.println(dep + "을 예금 했습니다.");
    }
    // 출금하기 메서드
    public void setWithdraw(final int with) {
        if (with > account) {
            System.out.println("잔액이 부족 합니다.");
        } else {
            account -= with;
        }
    }

    public void viewAccount() {
        System.out.println("현재 잔액은 " + account + "입니다.");
    }

}
