import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sales implements PullSubject {
    private Map<String, Integer> sales = new HashMap<>();
    private List<SalesObserver> observers = new ArrayList<>();

    public Sales(Map<String, Integer> sales) {
        this.sales = sales;
    }

    public void updatePrice(String name, int price) {
        sales.put(name, price);
        notificationObserver();
    }

    @Override
    public void addObserver(SalesObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(SalesObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notificationObserver() {
        //객체에서 필요한 정보만 가져갈 수 있도록 한다.
        for (SalesObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public int getPrice(String name) {
        if (sales.containsKey(name)) {
            return sales.get(name);
        }
        return -1;
    }
}