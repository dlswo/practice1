package comfort;

public class Main {

    public static void main(String[] args) {
        ComfortCal cc = new ComfortCal();
        ComfortUI cu = new ComfortUI(cc);
        cu.gethd();
        cu.result();
    }
}
