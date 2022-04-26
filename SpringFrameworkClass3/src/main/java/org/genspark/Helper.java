package org.genspark;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy

//Advice - What method do we call?
//Pointcut - where method need to be called
public class Helper {
    @Before("execution(public void show())")
    public void logOpen(){
        System.out.println("Log Begin...");
        System.out.println("2-3 transaction | 2-3 log | 2-3 security");
    }
    @After("execution(public void show())")
    public void logClose(){
        System.out.println("Log Stop...");
        System.out.println("2-3 closing clog | commit transaction | disable security ");
    }
}
