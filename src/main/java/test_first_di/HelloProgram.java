package test_first_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by fupeng on 2017/1/22.
 */


@ContextConfiguration(classes = Config.class)
public class HelloProgram {


    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans_di.xml");


        //注入另一个对象 构造器方式
        AAKnight aa = context.getBean("AAKnight", AAKnight.class);
        aa.embarkQuest();

        //注入常量 构造器方式
        AAKnight b = (AAKnight)context.getBean("Knight_02");
        b.print_name();

        //注入集合 构造器方式
        AAKnight c = (AAKnight)context.getBean("Knight_03");
        c.print_friend();

        //属性输入 setter
        AAKnight d = (AAKnight)context.getBean("Knight_04");
        d.print_age();

        //属性输入 setter 列表
        AAKnight a5 = (AAKnight)context.getBean("Knight_05");
        a5.print_friend();

        //自动扫描
        //Component + ComponentScan
        Knight a6 = (Knight)context.getBean("a6");
        a6.embarkQuest();

    }


}
