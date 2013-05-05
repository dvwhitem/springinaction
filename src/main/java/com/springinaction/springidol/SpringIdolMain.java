/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dv
 */
public class SpringIdolMain {

    public static void main(String[] args) throws PerformanceException {
        
        ApplicationContext ctx = 
                new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
        
       // Performer performer = (Performer) ctx.getBean("kenny2");
       // Performer performer = (Performer) ctx.getBean("duke");
      // Performer performer = (Performer) ctx.getBean("duke2"); 
        Performer performer = (Performer) ctx.getBean("kenny");
       performer.perform();
    }
}
