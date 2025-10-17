package 추상클래스기본;

public class IPhone extends Phone {
    public IPhone(String name) {
        super(name);
    }

    @Override
    void call() {
        System.out.println("추상 메서드를 상속 받아 Call 기능을 구현 합니다.");
    }

    @Override
    public void store() {
        System.out.println("Apple Store 기능을 구현 합니다.");
    }
}
