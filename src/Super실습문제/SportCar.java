package Super실습문제;
//- 인스턴스 필드: isTurbo (boolean)
//- 생성자:
//   - SportCar() : 부모의 기본 생성자 호출, turbo = false
//   - SportCar(String name) : super(280, "Red") 호출, turbo = true, 이름 지정
//- displayInfo() 오버라이드: turbo 여부까지 출력

public class SportCar extends Car {
    boolean isTurbo;
    public SportCar() {
        // 부모의 생성자 호출을 생략하면 기본 생성자가 호출 됨 : super()
        isTurbo = false;
    }
    public SportCar(String name) {
        super(280, "Red");
        isTurbo = true;
        this.name = name;
    }
    @Override
    void displayInfo() {
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("이름 : " + name);
        System.out.println("터보 : " + ((isTurbo) ? "ON" : "OFF"));
    }
}
