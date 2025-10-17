package 자동차만들기;

public class Bus extends Car implements AirCon, AutoPilot {
    private boolean airCon, auto;
    public Bus(String name) {
        super(150, 5, 100, 20, name);
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) fuelTank += 30;
        airCon = false;
        auto = false;
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