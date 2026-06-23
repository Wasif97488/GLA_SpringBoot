//package com.GLA_Spring_Maven;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class AppConfig {
//	
//	@Bean
//	public Student stud()
//	{
//		Student st = new Student();
//		st.setRollNo(1);
//		st.setsName("Wasif");
//		st.setSubject(".Net");
//		return st;
//	}
//	
//	@Bean
//	public Student stud1()
//	{
//		Student st = new Student();
//		st.setRollNo(2);
//		st.setsName("Rohit");
//		st.setSubject("Java");
//		//dependecy injection
//		st.setAddr(add());
//		return st;
//	}
//	
//	@Bean
//	public Hello he()
//	{
//		Hello h = new Hello();
//		h.setHello(100);
//		h.setGoing("going");
//		return h;
//	}
//	
//	@Bean
//	public Address add()
//	{
//		Address add = new Address();
//		add.setCity("Kolkata");
//		add.setState("West Bengal");
//		add.setPincode(700433);
//		add.setCountry("India");
//		return add;
//	}
//
//}
