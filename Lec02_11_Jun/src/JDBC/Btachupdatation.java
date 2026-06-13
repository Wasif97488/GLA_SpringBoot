package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Btachupdatation {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GLA","root","root");
		
		Statement st = con.createStatement();
		
//		int count=st.executeUpdate("insert into employee values(21,'sam','Good')");
//		st.executeUpdate("insert into employee values(22,'sang','Bad')");
//		st.executeUpdate("delete from employee where empid=101");
		
		st.addBatch("insert into employee values(21,'sam','Good')");
		st.addBatch("insert into employee values(22,'sang','Bad')");
		st.addBatch("delete from employee where empid=101");
		
		int[] a=st.executeBatch();
		System.out.println(a.length);
		
	}

}
