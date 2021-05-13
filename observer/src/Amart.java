public class Amart implements SalesObserver {
    private static final String APPLE = "apple";
    private static final String BANANA = "banana";
    private static final String GRAPE = "grape";

    private int applePrice;
    private int bananaPrice;
    private int grapePrice;


    public Amart(int applePrice, int bananaPrice, int grapePrice) {
        this.applePrice = applePrice;
        this.bananaPrice = bananaPrice;
        this.grapePrice = grapePrice;
    }

    @Override
    public void update(PullSubject subject) {
        applePrice = subject.getPrice(APPLE);
        bananaPrice = subject.getPrice(BANANA);
        grapePrice = subject.getPrice(GRAPE);
    }

    @Override
    public String toString() {
        return "Amart{" +
                "applePrice=" + applePrice +
                ", bananaPrice=" + bananaPrice +
                ", grapePrice=" + grapePrice +
                '}';
    }
}