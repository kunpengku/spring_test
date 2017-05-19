package test_aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by fupeng on 2017/4/26.
 */

@Component(value = "123")
public class B {

    @Autowired
    private A a;

    public void setA(A a) {
        this.a = a;
    }

    public void print(){
        System.out.println("method in B");
        a.print();
    }

    public void sing(){
        System.out.println("sing the sing");
    }


    public void test(){
        System.out.println("test the test");
    }


    public int test(int a){
        System.out.println("test the int");
        return 0;
    }
}
