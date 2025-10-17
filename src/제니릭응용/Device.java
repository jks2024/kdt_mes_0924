package 제니릭응용;

public abstract class Device {
    public abstract void turnOn();
    public abstract void turnOff();
}

// Printer
class Printer extends Device {
    @Override
    public void turnOn() {
        System.out.println("프린터의 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("프린터의 전원을 끕니다.");
    }
}

// Monitor
class Monitor extends Device {
    @Override
    public void turnOn() {
        System.out.println("모니터의 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("모니터의 전원을 끕니다.");
    }
}

// KeyBoard
class KeyBoard extends Device {
    @Override
    public void turnOn() {
        System.out.println("키보드의 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("키보드의 전원을 끕니다.");
    }
}