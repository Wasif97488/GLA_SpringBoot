package com.GLA_Spring_Maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext app = new ClassPathXmlApplicationContext("Spring-config.xml");
        
         Student s=  (Student)app.getBean("st");
//         System.out.println(s.getRollNo());
//         System.out.println(s.getsName());
//         System.out.println(s.getSubject());
//         System.out.println(s.getAddr().getCity());
//         System.out.println(s.getAddr().getCountry());
         
         
//        Student s1=(Student) app.getBean("st1");
//        System.out.println(s1.getsName());
//        System.out.println(s1.getRollNo());
//        System.out.println(s1.getSubject());
//        
             Address a=(Address) app.getBean("add");
//             System.out.println(a.getCity());
//             System.out.println(a.getCountry());
//             System.out.println(a.getPincode());
//             System.out.println(a.getState());
             
             
//         String[] beans=    app.getBeanDefinitionNames();
//         for(int i=0;i<beans.length;i++)
//         {
//        	 System.out.println(beans[i]);
//         }
             
//        Hello h=(Hello) app.getBean("hello");
//        System.out.println(h.getHello());
         Student s2=(Student) app.getBean("st");
         System.out.println(s2.getRollNo());
         System.out.println(s2.getsName());
         
       
        
        
    }
}
