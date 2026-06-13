package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatement {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GLA","root","root");
		
		PreparedStatement ps= con.prepareStatement("insert into employee values(?,?,?)");
		    ps.setInt(1, 1000);
		    ps.setString(2, "Kunal");
		    ps.setString(3, "TCS");
		    
		    ps.addBatch();
		 
		    
		    ps.setInt(1, 1001);
		    ps.setString(2, "Vansi");
		    ps.setString(3, "Do");
		    
		    ps.addBatch();

		    
		    ps.setInt(1, 1003);
		    ps.setString(2, "Kaushik");
		    ps.setString(3, "Flipkart");
		    ps.addBatch();

		    
		    ps.setInt(1, 1004);
		    ps.setString(2, "Tsmd");
		    ps.setString(3, "poidd");
		    ps.addBatch();
		    
		    ps.executeBatch();

		    
//		    int count=ps.executeUpdate();
//		    System.out.println(count);
//		Scanner sc = new Scanner(System.in);
//		int eid= sc.nextInt();
//		String name = sc.next();
//		String company = sc.next();
//		
//		ps.setInt(1, eid);
//		ps.setString(2, name);
//		ps.setString(3, company);
//		ps.executeUpdate();
//		
		
		    con.close();
		    
		
	}

}
