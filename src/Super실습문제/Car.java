package Super실습문제;
//- 인스턴스 필드: speed, color, name
//- 생성자 오버로딩:
//  - Car() : 기본 speed = 100, color = “White”, name = “BasicCar”
//  - Car(int speed, String color) : speed와 color 지정, name = “CustomCar”
//- displayInfo() 메서드: 자동차 정보를 출력

public class Car {
    int speed; // 접근제한자를 생략하면 default
    String color;
    String name;
    public Car() {
        speed = 100;
        color = "white";
        name = "BasicCar";
    }
    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
        name = "CustomCar";
    }
    void displayInfo() {
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("이름 : " + name);
    }
}
