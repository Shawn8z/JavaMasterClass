public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        int validVal;
        if (tonerLevel > 100) {
            validVal = 100;
        } else if (tonerLevel < 0) {
            validVal = 0;
        } else {
            validVal = tonerLevel;
        }
        this.tonerLevel = validVal;
        this.duplex = isDuplex;
        System.out.println("Printer has toner level of " + this.tonerLevel);
    }

    public int addToner(int tonerAmount) {
        int newLevel = tonerLevel + tonerAmount;
        if (newLevel > 100 || newLevel < 0) {
            return -1;
        }
        this.tonerLevel = newLevel;
        return newLevel;
    }

    public int printPages(int pages) {
        if (duplex) {
            System.out.println("This printer a duplex printer");
            this.pagesPrinted += pages / 2 + pages % 2;
            return pages / 2 + pages % 2;
        } else {
            this.pagesPrinted += pages;
            return pages;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
