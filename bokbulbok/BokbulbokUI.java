package bokbulbok;

import java.util.Scanner;

public class BokbulbokUI {
    Bokbulbok bbb ;

    public BokbulbokUI(Bokbulbok bbb) {
        this.bbb = bbb;
    }

    public void playGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("게임을 시작합니다.");
        for (int i = 0 ; i < bbb.itemVOS.length;i++) {
            System.out.println("Enter");
            sc.nextLine();
            System.out.println(this.bbb.selectOne());
            if (this.bbb.itemVOS[i].value.equals("당첨")) {
                System.out.println("니가 쏴");
                break;
            }
        }
    }

}
