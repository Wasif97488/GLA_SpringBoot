package JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JavaDatabaseOperation {
	
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		//load and register the driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GLA","root","root");
		
		    Statement st=  con.createStatement();
		    
//		    String query="create table Employee(EmpId int,EmpName varchar(20),ComName varchar(20))";
//		    
//		            st.executeUpdate(query);
		    
//		    String query = "insert into employee value(101,'Wasif','Coding Blocks')";
//		            st.executeUpdate(query);
//		    Scanner sc = new Scanner(System.in);
//		      for(int i=1;i<=5;i++)
//		      {
//		    	  System.out.println("Enter the EMp Number");
//				    int empid=sc.nextInt();
//				    System.out.println("Enter the EMp NAme");
//				    String name = sc.next();
//				    System.out.println("Enter the emp Company name");
//				    String company=sc.next();
//				    // insert into employee values(101,'Rohit','Amazon'";
//				    String query="insert into employee values("+empid+",'"+name+"','"+company+"');";
//				    st.executeUpdate(query);
//		      }
		    
//		    String query="update Employee set comName='Google' where empid=103";
//		    st.executeUpdate(query);
		 
		    
//		    String query = "insert into employee values(2,'Wasif','JPMogran3')";
//		     int count=    st.executeUpdate(query);
//		     System.out.println(count);
		    
//		    String query= "delete from employee where empid=2";
//		    int count=st.executeUpdate(query);
//		    System.out.println(count);
		    
//		    String query="insert into employee values(2,'Wasif','JPMogran3')";
//		    boolean b =st.execute(query);
//		    System.out.println(b);
//		    
		    String s1 = "select * from employee";
		   boolean b1 = st.execute(s1);
		   System.out.println(b1);
		    
		            
		            con.close();
		            
		    
		    
		
		
		
	}

}
