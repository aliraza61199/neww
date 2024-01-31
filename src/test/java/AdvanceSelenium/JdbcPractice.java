package AdvanceSelenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JdbcPractice {     //java 

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Driver Dbdriver= new  Driver();
		DriverManager.registerDriver(Dbdriver);
		//jdbc :mysql ;//localhost:3307/selenium143 is database name 
		Connection connection= DriverManager.getConnection(null, null, null);
		Statement statement = connection.createStatement();
		ResultSet result =statement.executeQuery("select * from ");
		while((result.next())) {
			System.out.println(result.getString("")+" "+result.getString(""));
		}
		

	}

}
