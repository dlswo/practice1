package FoodSelect;

import bokbulbok.Bokbulbok;

import java.util.Arrays;
import java.util.Collections;

public class BokBuler {
    FoodVO[] foodVOS ;
    int idx;

    public BokBuler(FoodVO[] foodVOS) {
        this.foodVOS = foodVOS;
        this.idx = idx;
    }

    public BokBuler(String[] str){
        this.foodVOS = new FoodVO[str.length];
        for(int i=0;i<str.length;i++){
            this.foodVOS[i] = new FoodVO(str[i]);
        }

    }

    public void shuffle() {
        Collections.shuffle(Arrays.asList(foodVOS));
    }

    public FoodVO selectOne() {
        FoodVO food = this.foodVOS[idx];
        idx++;
        return food;
    }
}
