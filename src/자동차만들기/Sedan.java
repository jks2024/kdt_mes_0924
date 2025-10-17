package 자동차만들기;

public class Sedan extends Car implements AirCon, Audio, AutoPilot {
    private boolean airCon, audio, auto;

    public Sedan(String name) {
        super(200, 12, 45, 4, name);
        airCon = false;
        audio = false;
        auto = false;
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) seatCnt += 1;
    }

    @Override
    public void setAirCon(boolean on) {
        this.airCon = on;
        if(airCon) fuelEff *= 0.95;
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

    @Override
    public void setAutoPilot(boolean on) {
        this.auto = on;
        if(auto) {
            maxSpeed = (int)Math.round(maxSpeed * 0.9);
        }
    }

    @Override
    public boolean isAutoPilotOn() {
        return this.auto;
    }
}