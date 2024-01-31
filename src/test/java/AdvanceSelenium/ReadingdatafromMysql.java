package AdvanceSelenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


public class ReadingdatafromMysql {
	
	public static void readingDataFromDB(String dbname,String query, String string) throws SQLException 
	{
		
		Driver Dbdriver= new  Driver();
		DriverManager.registerDriver(Dbdriver);
		//jdbc :mysql ;//localhost:3307/selenium143 is database name 
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "roo"
				+ "t", "root");
		Statement statement = connection.createStatement();
		ResultSet result =statement.executeQuery("select * from ");
		while((result.next())) {
			System.out.println(result.getString("columnName"));
		}	
	}

    public static void main(String[] args) {
//    	readingDataFromDB("selenium143","select*from dem;","id");
//    	readingDataFromDB("select * from demo where city=67;","firstname");
    }

    }