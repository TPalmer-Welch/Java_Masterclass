public class Appliance {
    private int temperature;
    private boolean onOff;

    public Appliance(){}

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void turnOn(){
        this.onOff = true;
    }
}
