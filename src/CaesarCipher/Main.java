package CaesarCipher;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("영어 단어를 입력하시오 : ");
        String str = sc.nextLine();
        Changer cg = new Changer(str);
        cg.cipherChange();

    }
}
