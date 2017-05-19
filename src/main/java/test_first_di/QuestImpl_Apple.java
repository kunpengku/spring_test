package test_first_di;

import org.springframework.stereotype.Component;

/**
 * Created by fupeng on 2017/5/19.
 */

@Component("t_app")
//@Primary
public class QuestImpl_Apple implements Quest {
    public void embark() {
        System.out.println("eat an apple");
    }
}
