package com.GLA_Spring_Maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import Wish.Hello;
@ComponentScan(basePackages = {"com.GLA_Spring_Maven","Wish"})
public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext app = new AnnotationConfigApplicationContext(Main.class);
		Student s=(Student) app.getBean(Student.class);
		Student s1=(Student) app.getBean(Student.class);
		System.out.println(s);
		System.out.println(s1);

//		System.out.println(s.getRollNo());
//		System.out.println(s.getsName());
//		System.out.println(s.getAddr().getCity());
//		System.out.println(s.getAddr().getState());
		
//		 Hello h =(Hello) app.getBean(Hello.class);
//	        System.out.println(h.getGoing());
//	        System.out.println(h.getHello());
//	        
//	        Address add =(Address) app.getBean(Address.class);
//	        System.out.println(add.getCity());
//	        System.out.println(add.getCountry());
	        
	}

}
