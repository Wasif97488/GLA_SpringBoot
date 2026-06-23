package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext app  =new ClassPathXmlApplicationContext("Spring/Spring-config.xml");
		Student s=(Student)app.getBean("stud");
		System.out.println(s.getRollNo());
		System.out.println(s.getsName());
		                    
	}

}
