package FoodSelect;


import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ScanEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        String[] arr = st.split(",");
        Collections.shuffle(Arrays.asList(arr));

        System.out.println(Arrays.asList(arr));
    }
}
