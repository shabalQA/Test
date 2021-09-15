package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCconnection {
	
	public void databaseconnection() throws SQLException {
		
		String host="localhost";
		String port="3306";
		
		
		Connection c= DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/shabalqa", "root", "Frontech@mysql123");
		Statement st= c.createStatement();
		ResultSet rs= st.executeQuery("select * from employeeinfo where age=28;");
		
		while(rs.next()) {
			
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("age"));
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("location"));
			
		}
		
		
	}
			
			

}
