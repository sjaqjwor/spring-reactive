public interface Subject {
    void add(NewsPaperObserver newsPaperObserver);
    void remove(NewsPaperObserver newsPaperObserver);
    void noti();
}
