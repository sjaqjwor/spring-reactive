import java.util.LinkedList;
import java.util.List;

public class BroadCast implements Subject{
    private List<NewsPaperObserver> observers = new LinkedList<>();
    private String content;

    public BroadCast(String content) {
        this.content = content;
    }

    public void updateContent(String content){
        if (this.content.isEmpty() || !this.content.equals(content)){
            this.content=content;
        }
    }

    @Override
    public void add(NewsPaperObserver newsPaperObserver) {
        observers.add(newsPaperObserver);
    }

    @Override
    public void remove(NewsPaperObserver newsPaperObserver) {
        observers.remove(newsPaperObserver);
    }

    @Override
    public void noti() {
        observers.forEach(s -> s.update(this.content));
    }
}
