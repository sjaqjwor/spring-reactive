public class Bmart implements SalesObserver {
    //B마트는 사과를 취급한다.
    private static final String APPLE = "apple";

    private int applePrice;

    public Bmart(int applePrice) {
        this.applePrice = applePrice;
    }

    @Override
    public void update(PullSubject subject) {
        applePrice = subject.getPrice(APPLE);
    }

    @Override
    public String toString() {
        return "Bmart{" +
                "applePrice=" + applePrice +
                '}';
    }
}
