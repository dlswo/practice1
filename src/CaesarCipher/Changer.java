package CaesarCipher;

public class Changer {

    String str;

    public Changer(String str) {
        this.str = str;

    }

    public void cipherChange() {

        char[] ch = str.toCharArray();
        for (int i = 0 ; i < ch.length;i++) {
            if (ch[i] >= 88) {
                ch[i] -= 26;
            }
            ch[i] += 3;
        }
        String result = String.valueOf(ch);
        System.out.println(result);

    }
}
