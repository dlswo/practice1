package FoodSelect;

public class FoodVO {
    String value;

    @Override
    public String toString() {
        return "FoodVO{" +
                "value='" + value + '\'' +
                '}';
    }

    public FoodVO(String value) {
        this.value = value;
    }

}
