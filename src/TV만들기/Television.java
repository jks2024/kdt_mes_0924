package TV만들기;
// 전원 : ON/OFF
// 채널 : 1 ~ 999
// 볼륨 : 0 ~ 100사이
// 인스턴스 필드와 게터, 세터 메서드 구현
// 매개변수가 있는 생성자를 통해 기본값 대입
// TV 3대 만들기
// TV의 정보는 toString 메서드를 오버라이드 해서 출력하기

public class Television {
    // 인스턴스 필드
    private boolean power;
    private int channel;
    private int volume;

    // 매개변수가 있는 생성자
    public Television(boolean power, int cnl, int vol) {
        this.power = power; // this는 자신의 객체를 참조하는 이름, 매개변수와 필드의 이름이 같은 경우는 사용해야 함
        channel = cnl;
        volume =vol;
    }

    // 매개 변수가 없는 생성자
    public Television() {
        power = false;
        channel = 20;
        volume = 30;
    }
    // 매개 변수가 1개 있는 생성자
    public Television(boolean power) {
        this.power = false;
        channel = 30;
        volume = 30;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 999) {
            this.channel = channel;
            System.out.println("채널을 " + channel + "로 변경 하셨습니다.");
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("볼륨을 " + volume + "으로 변경 하였습니다.");
        } else {
            System.out.println("볼륨 설정 범위가 아닙니다.");
        }
    }
    @Override
    public String toString() {
        return "=".repeat(7) + "TV 정보" + "=".repeat(7) + "\n" +
                String.format("전원 : %s\n", (power ? "ON" : "OFF")) +
                String.format("볼륨 : %s\n", volume) +
                String.format("채널 : %s\n", channel);
    }
}
