package comfort;

import java.util.Scanner;

public class ComfortUI {
    ComfortCal cc;
    double d,h ;

    public ComfortUI(ComfortCal cc) {
        this.cc = cc;
    }

    public void gethd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("온도를 입력해 주세요: ");
        d = Double.parseDouble(sc.nextLine());
        System.out.println("습도를 입력해 주세요: ");
        h = Double.parseDouble(sc.nextLine());
    }

    public void result() {
        double result = cc.comfortCal(d,h);


        System.out.println(d + ":" + h + ":" + result);
        if(result >= 80) {
            System.out.println("전원 불쾌감을 느낌");
        }else if(result >= 75){
            System.out.println("50% 정도 불쾌감을 느낌");
        }else if(result >= 68){
            System.out.println("불쾌감을 나타내기 시작함");
        }else {
            System.out.println("전원 쾌적함을 느낌");
        }

    }

}
