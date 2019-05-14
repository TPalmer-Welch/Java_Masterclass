public class Oven extends Appliance{

    public Oven(){ super(); }

    @Override
    public void turnOn(){
        System.out.println("Oven on");
        super.turnOn();
    }

}
