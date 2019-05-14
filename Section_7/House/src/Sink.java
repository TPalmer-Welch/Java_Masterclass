public class Sink {

    private int water_flow;
    private String color;

    public Sink(String color){
        this.color  = color;
    }

    public void turnOn(int water_flow) {
        this.water_flow = water_flow;
    }

    public void turnOff(){
        this.water_flow = 0;
    }

}
