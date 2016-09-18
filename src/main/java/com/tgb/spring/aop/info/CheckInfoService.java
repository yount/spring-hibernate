package com.tgb.spring.aop.info;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CheckInfoService {
	
	private Logger logger = Logger.getLogger(CheckInfoService.class);
	
	@Pointcut("execution(* com.info.service.impl.*.get*(..))")
	public void checkInfoService(){
		logger.info("**************The System is Searching Information For You****************");  
		System.out.println("**************The System is Searching Information For You****************");  
	}
	
	
	@Before("checkInfoService()")  
    public void beforeCheck(){  
        System.out.println("InfoService >>>>>>>> 准备搜查用户..........");  
    }  
      
    @After("checkInfoService()")
    public void afterCheck(){  
        System.out.println("InfoService >>>>>>>>　搜查用户完毕..........");  
    }  
  
    //声明环绕通知
    @Around("checkInfoService()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {    
        System.out.println("InfoService 进入方法---环绕通知");    
        Object o = pjp.proceed();    
        System.out.println("InfoService 退出方法---环绕通知");    
        return o;
    }
}
