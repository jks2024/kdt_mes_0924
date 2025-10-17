package 정적맴버;
// static : 정적 멤버(필드) 및 메서드를 만들 때 사용, 클래스 생성 시 함께 생성되고, 객체 생성 시 생성되지 않음
// 은행을 5개 만들고 각각에 대해서 입금, 출금, 조회 기능 구현하기
// Bank 클래스를 객체가 몇개 생성되었는지를 확인하기 위해서 정적 메서드 호출 해서 결과 확인하기

public class StaticMain {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        kakao.setDeposit(3000);
        kakao.setWithdraw(2000);
        kakao.viewAccount();

        Bank nh = new Bank("농협", 0);
        nh.setDeposit(3000);
        nh.setWithdraw(5000);
        nh.viewAccount();

        Bank shinhan = new Bank("신한", 1000);
        shinhan.setDeposit(1000);
        shinhan.setWithdraw(500);
        shinhan.viewAccount();

        // getCount()는 정적 메서드이므로 객체 이름이 아닌 클래스 이름으로 접근 해야 함
        System.out.println("은행 객체 생성 횟수 : " + Bank.getCount());


    }
}
