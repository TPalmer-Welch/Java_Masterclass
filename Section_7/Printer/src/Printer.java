public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // Pages printed auto defaults to 0 on creation
    public Printer( int tonerLevel, boolean duplex ){
        setTonerLevel( tonerLevel );
        this.duplex = duplex;
    }

    private void setTonerLevel(int tonerLevel) {
        if ( tonerLevel >=0 && tonerLevel <= 100 ) {
            this.tonerLevel = tonerLevel;
            System.out.println("Toner levels set to " + tonerLevel);
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void fillToner(){
        setTonerLevel( 100 );
        System.out.println("Toner filled");
    }

    public void printPages( int pages ){
        if ( (this.tonerLevel - pages) > 0) {
            setTonerLevel(this.tonerLevel - pages);
            pagesPrinted++;
            System.out.println("Printing...");
        }
        else
            System.out.println("Not enough toner, please refill");
    }
}
