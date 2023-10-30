package com.jspiders.jdbc.operation;
import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcinsertstandardcode1 {
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;
	public static void main(String[] args) {
		try {
			connection =openConnection();
			statement=connection.createStatement();
			query="INSERT INTO student Values(2,'sureah','suresh@gmail.com',25,30000)";//static query
			int row=statement.executeUpdate(query);
			System.out.println(row+"row(s) affected");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				closeConnection();
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	
		
	}
	private static Connection openConnection()throws SQLException
	{
		driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3","root","root");
		
	}
	private static void closeConnection()throws SQLException
	{
		if(statement != null) {
			statement.close();
		}
		if(connection != null) {
			connection.close();
		}
		DriverManager.deregisterDriver(driver);
	}

}
