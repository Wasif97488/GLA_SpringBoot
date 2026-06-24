package com.GLA_Spring_JDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import Configuration.AppConfig;
import Dao.StudentDao;
import Dao.StudentDaoImpl;
import Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
    	JdbcTemplate jd=  app.getBean(JdbcTemplate.class);
    	               
//        String query="insert into students values(1,'Wasif','C++')";
//        jd.update(query);
//        String query1="insert into students values(2,'Harsh','Java')";
//        jd.update(query1);
    	
    StudentDaoImpl studendao=   app.getBean(StudentDaoImpl.class);
//    
    
//    Student s1 = new Student();
//    s1.setSid(56);
//    studendao.delete(s1);
    
//    Student s2 = new Student();
//    s2.setSid(1);
//    s2.setName("Rohit");
//    studendao.update(s2);
    
   List<Student> st= studendao.findAllData();
   for(Student s:st)
   {
	   System.out.println(s.getSid()+"   "+s.getName()+"  "+s.getSubject());
   }
    
    

    
   
   

    

    }
}
