package test_first_di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by fupeng on 2017/5/19.
 */
@Configuration
@ComponentScan("test_first_di")
public class Config {

//    @Bean(name="a6")
    public Knight getKnight(){
        return new KnightImpl_auto();
    }


}
