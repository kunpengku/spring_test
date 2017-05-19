package test_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fupeng on 2017/1/22.
 */


public class HelloProgram {


    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        B b =  context.getBean("123",B.class);

        b.sing();

        b.test();

        b.test(1);

    


    }


}
