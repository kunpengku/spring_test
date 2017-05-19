package test_aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by fupeng on 2017/5/11.
 */

@Aspect
public class AspectJtest {

    @Pointcut("execution(public int test(..))")
    public void test1(){

    }

    @Before("test1() ")
    public void beforeTest(){
        System.out.println("before");
    }




}
