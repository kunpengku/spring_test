package test_first_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fupeng on 2017/1/22.
 */


public class HelloProgram {


    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans_di.xml");


        AAKnight aa = context.getBean("AAKnight", AAKnight.class);

        aa.embarkQuest();



    }


}
