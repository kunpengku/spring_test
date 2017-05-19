package test_first_di;

import java.util.List;

/**
 * Created by fupeng on 2017/5/18.
 */

public class AAKnight implements Knight {

    private String name;
    private Quest quest;



    private List<String> friend;

    private int age;

    //无参数构造函数
    AAKnight( ){
    }
    AAKnight(Quest q){
        this.quest  = q;

    }

    AAKnight(String n){
        this.name = n;
    }

    AAKnight(List<String> l){
        this.friend = l;
    }
    public void embarkQuest() {


        quest.embark();
    }

    public void print_name(){
        System.out.println(this.name);
    }

    public void print_friend(){
        System.out.println(this.friend);
    }

    public void print_age(){
        System.out.println(this.age);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFriend(List<String> friend) {
        this.friend = friend;
    }
}
