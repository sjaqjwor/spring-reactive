public interface PullSubject {
    void addObserver(SalesObserver observer);

    void removeObserver(SalesObserver observer);

    void notificationObserver();

    int getPrice(String name);
}
