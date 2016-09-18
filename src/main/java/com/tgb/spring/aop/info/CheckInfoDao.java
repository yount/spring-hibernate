package com.tgb.spring.aop.info;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CheckInfoDao {

	@Pointcut("execution(* com.info.dao.*.getInfoByUUID*(..))")
    public void checkInfoDao(){
        System.out.println("**************The System is Searching Information For You****************");  
    }  
      
    @Before("checkInfoDao()")  
    public void beforeCheck(){  
        System.out.println("InfoDao >>>>>>>> 准备搜查用户..........");  
    }  
      
    @After("checkInfoDao()")
    public void afterCheck(){  
        System.out.println("InfoDao >>>>>>>>　搜查用户完毕..........");  
    }  
  
      
     //声明环绕通知
    @Around("checkInfoDao()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {    
        System.out.println("InfoDao 进入方法---环绕通知");    
        Object o = pjp.proceed();    
        System.out.println("InfoDao 退出方法---环绕通知");    
        return o;
    }    
	
}
