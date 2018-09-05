package bokbulbok;

import java.util.Arrays;
import java.util.Collections;

public class Bokbulbok {
    ItemVO[] itemVOS ;
    int idx;

    public Bokbulbok(ItemVO[] itemVOS) {
        this.itemVOS = itemVOS;
        this.idx = idx;

    }

    public void shuffle() {
        Collections.shuffle(Arrays.asList(itemVOS));
    }

    public ItemVO selectOne() {
        ItemVO result =itemVOS[idx];
        idx++;
        return result;
    }

}
