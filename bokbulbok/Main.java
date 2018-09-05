package bokbulbok;

public class Main {

    public static void main(String[] args) {

        ItemVO[] arr = {
                new ItemVO("꽝"),
                new ItemVO("꽝"),

                new ItemVO("꽝"),

                new ItemVO("꽝"),
                new ItemVO("당첨"),

        };
        Bokbulbok bbb = new Bokbulbok(arr);
        bbb.shuffle();

        BokbulbokUI bu = new BokbulbokUI(bbb);
        bu.playGame();
    }
}
