public class KimNews implements NewsPaperObserver {
    private String title;
    @Override
    public void update(String content) {
        this.title = content;
    }

    public void tellTitle(){
        System.out.println("title is "+this.title);
    }
}
