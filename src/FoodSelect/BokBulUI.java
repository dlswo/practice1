package FoodSelect;

public class BokBulUI {

    BokBuler bb;

    public BokBulUI(BokBuler bb) {
        this.bb = bb;
    }

    public void playGame(){
        System.out.println("게임을 시작하지.");
        System.out.println(bb.selectOne());
    }
}
