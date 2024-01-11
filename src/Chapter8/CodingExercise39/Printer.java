package Chapter8.CodingExercise39;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmunt) {
        if (tonerAmunt > 0 && tonerAmunt <= 100) {
            int tempAmount = tonerAmunt + tonerLevel;
            if (tempAmount > 100) {
                return -1;
            } else {
                tonerLevel += tonerAmunt;
                return tonerLevel;
            }
        }
        return -1;
    }

    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
