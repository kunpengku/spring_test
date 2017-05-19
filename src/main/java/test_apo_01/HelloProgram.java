package test_apo_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test_first_di.Knight;

/**
 * Created by fupeng on 2017/1/22.
 */


public class HelloProgram {


    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("knights.xml");


        Knight aa = (Knight)context.getBean("AAKnight");

        aa.embarkQuest();



    }


}
