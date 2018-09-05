package comfort;

public class ComfortCal {

    public double comfortCal(double d,double h) {
        double result = (1.8 * d) - (0.55 * (1 - h/100) * ((1.8 * d) - 26))  + 32;
        return result;
    }
}
