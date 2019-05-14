public class Room {

    private Oven oven;
    private Fridge fridge;
    private Sink sink ;

    public Room(Oven oven, Fridge fridge, Sink sink) {
        this.oven = oven;
        this.fridge = fridge;
        this.sink = sink;
    }

    public Oven getOven() {
        return oven;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public Sink getSink() {
        return sink;
    }
}
