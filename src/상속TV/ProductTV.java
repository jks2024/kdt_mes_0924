package 상속TV;
// ProtoTypeTV를 상속 받음
// 매개변수가 있는 생성자와 없는 생성자 만들기
// 볼륨을 오버라이드해서 0 ~ 200까지 확장
// 채널도 오버라이드해서 1 ~ 1999까지 확장 (setChannel())
// 채널을 오버로딩을 해서 setChannel(boolean internet, int channel) 기능 확장
// - internet 기능이 켜지면 채널 설정 정보는 무시하고 인터넷 티비로 동작
// 결과 출력은 toString() 메서드를 오버라딩해서 구현

public class ProductTV extends ProtoTypeTV {
    boolean isInternet;

    public ProductTV() {}
    public ProductTV(boolean power, int cnl, int vol, boolean internet) {
        this.power = power;
        this.channel = cnl;
        this.volume = vol;
        this.isInternet = internet;
    }
    @Override  // 문법적으로 오버라이드 관계가 성립하는지 체크 해줌
    // 오버라이드 : 부모가 가진 메서드를 재정의 함 (자식이 재정의 하는 경우 자식 메서드가 호출 됨)
    public void setVolume(int vol) {
        if (vol >= 0 && vol <= 200) {
            this.volume = vol;
            System.out.println("볼륨을 " + vol + "로 변경 하였습니다.");
        } else {
            System.out.println("볼륨 설정 범위가 아닙니다.");
        }
    }
    @Override
    public void setChannel(int cnl) {
        if (cnl >= 1 && cnl <= 1999) {
            this.channel = cnl;
            System.out.println("채널을 " + channel + "로 변경 하였습니다.");
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
    // 메서드 오버로딩 : 메서드 이름이 동일하고, 메서드 매개변수의 갯수 또는 타입으로 메서드를 구분해서 호출 하는 것 (정적 바인딩)
    public void setChannel(boolean internet, int cnl) {
        if (internet) {
            this.isInternet = true;
            System.out.println("인터넷 모드가 켜졌습니다.");
        } else {
            setChannel(cnl);
        }
    }
    @Override
    public String toString() {
        String title = "=".repeat(7) + "TV 정보" + "=".repeat(7) + "\n";
        String power = "전원 : " + this.power + "\n";
        String cnl = "채널 : " + this.channel + "\n";
        String vol = "볼륨 : " + this.volume + "\n";
        return title + power + cnl + vol;
    }

}
