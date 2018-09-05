package FoodSelect;

import bokbulbok.Bokbulbok;
import bokbulbok.BokbulbokUI;

public class Main {
    public static void main(String[] args) {
        String[] arr = {
                "아이스크림","고기","삼겹살","갈비","회","스시"
        };
        BokBuler bb = new BokBuler(arr);
        bb.shuffle();
        BokBulUI bu = new BokBulUI(bb);
        bu.playGame();


    }
}
