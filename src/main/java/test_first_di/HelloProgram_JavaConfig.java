package test_first_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by fupeng on 2017/1/22.
 */


public class HelloProgram_JavaConfig {


    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        //自动扫描
        //Component + ComponentScan
        Knight a6 = (Knight)context.getBean("a6");
        a6.embarkQuest();

    }


}
