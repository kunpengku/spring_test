package test_aop;

import org.springframework.stereotype.Component;

/**
 * Created by fupeng on 2017/4/26.
 */

@Component
public class A {
    private String m = "nammm";
    public void print(){
        System.out.println("method in A");
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }
}
