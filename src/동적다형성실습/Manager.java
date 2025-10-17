package 동적다형성실습;
//3. Manager(배송 관리자) 클래스
//  • 메서드 send(Delivery d)
//  • 어떤 배송 방식이 오더라도, “○○회사가 배송을 진행합니다.” 출력 후 d.deliver() 호출
public class Manager {
    String name;

    public Manager(String name) {
        this.name = name;
    }
    public void send(Delivery d) {
        System.out.println(name + "매니저가 " + d.getCompany() + "회사의 배송을 지시합니다.");
        d.deliver();  // 오버라이딩 된 실제 자식 클래스 메서드 실행
        System.out.println();
    }
}
