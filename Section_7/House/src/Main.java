public class Main {


    public static void main(String[] args){

        Oven oven = new Oven();
        Fridge fridge = new Fridge();
        Sink sink = new Sink("Metal");

        Room kitchen = new Room( oven, fridge, sink);

        kitchen.getOven().turnOn();
    }
}
