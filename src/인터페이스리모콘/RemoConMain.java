package 인터페이스리모콘;
// 인터페이스 : 클래스가 구현해야 할 메서드들의 설계명세
// - "이런 기능을 제공해야 한다"는 규칙 또는 약속을 정의
// - 이를 통해 다양한 클래스 동일한 기능을 일관된 형식으로 구현 할 수 있음
// - 자바는 클래스의 다중 상속을 허용하지 않지만, 인터페이스는 다중 구현이 가능

// RemoteControl 인터페이스를 상속 받아 Audio 클래스 생성
// RemoteControl 인터페이스를 상속 받아 PS4 클래스 생성
// RemoteControl 인터페이스를 상속 받아 Computer 클래스 생성

import java.util.Scanner;

public class RemoConMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoteControl remoteControl;  // RemoteControl 인터페이스에 대한 참조 변수
        System.out.print("제품을 선택 하세요 [1]Audio [2]PS4 [3]Computer : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: remoteControl = new Audio(); break;
            case 2: remoteControl = new PS4(); break;
            case 3: remoteControl = new Computer(); break;
            default: remoteControl = null;
        }
        remoteControl.turnOn();
        remoteControl.setVolume(34);

        RemoteControl carAudio = new RemoteControl() {
            private int volume;
            @Override
            public void turnOn() {
                System.out.println("Car Audio를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("Car Audio를 끕니다.");
            }

            @Override
            public void setVolume(int volume) {
                if(volume > RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MAX_VOLUME;
                } else if(volume < RemoteControl.MIN_VOLUME) {
                    this.volume = RemoteControl.MIN_VOLUME;
                } else {
                    this.volume = volume;
                }
            }
        };
        carAudio.turnOn();
        carAudio.setVolume(20);
    }
}
