package 자동차만들기;

public class SportCar extends Car implements AirCon, Audio {
    private boolean airCon, audio;

    public SportCar(String name) {
        super(250, 8, 30, 2, name);
        airCon = false;
        audio = false;
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) maxSpeed *= 1.2;
    }

    @Override
    public void setAirCon(boolean on) {
        this.airCon = on;
        if (airCon) fuelEff *= 0.95;
    }

    @Override
    public boolean isAirConOn() {
        return airCon;
    }

    @Override
    public void setAudio(boolean on) {
        this.audio = on;
    }

    @Override
    public boolean isAudioOn() {
        return audio;
    }
}

