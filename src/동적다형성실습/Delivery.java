package 동적다형성실습;
//1. 부모 클래스: Delivery
//  • 필드: String company (배송회사 이름)
//  • 메서드: deliver() (기본 구현 “배송을 시작합니다.”)
//2. 자식 클래스: ParcelDelivery, QuickDelivery, AirDelivery
//  • 각각 deliver() 메서드를 오버라이딩
//  • ParcelDelivery: “택배 배송을 시작합니다. 2~3일 소요됩니다.”
//  • QuickDelivery: “퀵 배송을 시작합니다. 당일 도착 예정입니다.”
//  • AirDelivery: “항공 배송을 시작합니다. 해외로 출발합니다.”
public class Delivery {
    String company;
    public Delivery(String company) {
        this.company = company;
    }
    public void deliver() {
        System.out.println("배송을 시작합니다.");
    }
    public String getCompany() {
        return company;
    }
}

class ParcelDelivery extends Delivery {

    public ParcelDelivery(String company) {
        super(company);  // 부모의 생성자 호출, 부모가 매개변수가 있는 생성자를 가지고 있음
    }
    @Override
    public void deliver() {
        System.out.println("택배 배송을 시작합니다. 2~3일 소요됩니다.");
    }
}

class QuickDelivery extends Delivery {

    public QuickDelivery(String company) {
        super(company);
    }
    @Override
    public void deliver() {
        System.out.println("퀵 배송을 시작합니다. 당일 도착 예정입니다");
    }
}

class AirDelivery extends Delivery {

    public AirDelivery(String company) {
        super(company);
    }
    @Override
    public void deliver() {
        System.out.println("항공 배송을 시작합니다. 해외로 출발합니다.");
    }
}
