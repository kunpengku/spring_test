package test_first_di;

/**
 * Created by fupeng on 2017/5/18.
 */

public class AAKnight implements Knight {

    private Quest quest;
    AAKnight(Quest q){
        this.quest  = q;

    }
    public void embarkQuest() {


        quest.embark();
    }
}
