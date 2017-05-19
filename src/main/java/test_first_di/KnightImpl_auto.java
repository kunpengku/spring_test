package test_first_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by fupeng on 2017/5/19.
 */

@Component("a6")
//@Named 和 Component作用一样
public class KnightImpl_auto implements Knight {

    @Autowired
    @Qualifier("t_app")
    private Quest q;

    public void embarkQuest() {
        q.embark();
//        System.out.println("emememememememememe a6");
    }


}
