package 인터페이스리모콘;

// implemenets 키워드로 interface를 상속 받음
public class Audio implements RemoteControl {
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
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
    @Override
    public void setMute(boolean mute) {
        if(mute) System.out.println("오디오를 무음 처리 합니다.");
        else System.out.println("오디오 무음을 해제 합니다.");
    }

}
