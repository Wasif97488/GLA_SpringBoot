package JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GLA","root","root");
		
		Statement st = con.createStatement();
		
		String query="select * from employee";
	    ResultSet rs=	st.executeQuery(query);
//	    while(rs.next())
//	    {
//	    	System.out.print(rs.getInt()+"   ");
//	    	System.out.print(rs.getString("empname")+"   ");
//	    	System.out.println(rs.getString("comname"));
//	    }
	    
//	         DatabaseMetaData dbmd=    con.getMetaData();
//	         System.out.println(dbmd.getDriverName());
//	         System.out.println(dbmd.getDatabaseMajorVersion());
//	         System.out.println(dbmd.getDatabaseMinorVersion());
//	         System.out.println(dbmd.getNumericFunctions());
		    
	         
//	       ResultSetMetaData rsmd=  rs.getMetaData();
//	            int colNumber=   rsmd.getColumnCount();
//	            for(int i=1;i<=colNumber;i++)
//	            {
//	            	System.out.println(rsmd.getColumnName(i));
//	            }
	            
		con.close();
		
	}

}
