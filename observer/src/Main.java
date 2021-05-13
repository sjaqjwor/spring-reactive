import java.util.Observable;

public class Main {

    public static void main(String[] args) {
        BroadCast broadCast = new BroadCast("하이");
        KimNews kimNews = new KimNews();
        LeeNews leeNews = new LeeNews();

        broadCast.add(kimNews);
        broadCast.add(leeNews);
        kimNews.tellTitle();
        leeNews.tellTitle();
        System.out.println("---------------------");
        broadCast.updateContent("변경되었다");
        

    }
}
