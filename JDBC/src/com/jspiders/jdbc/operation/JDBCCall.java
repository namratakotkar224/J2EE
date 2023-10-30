package com.jspiders.jdbc.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;


public class JDBCCall {
	private static Connection connection;
	private static CallableStatement callablestatement;
	private static ResultSet resultset;
	private static String query;
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
		connection=openConnection();
		query="call p1()";
		callablestatement=(CallableStatement) connection.prepareCall(query);
		callablestatement.execute();
		callablestatement.getResultSet();
		while(resultset.next()) 
		{
			System.out.println(resultset.getInt(1));
			System.out.println(resultset.getString(2));
			System.out.println(resultset.getString(3));
			System.out.println(resultset.getInt(4));
			System.out.println(resultset.getDouble(5));
			
		}
		}
		catch(ClassNotFoundException | SQLException e) {
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
		
	

	private static Connection openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3", "root", "root");

		
	}
	private static void closeConnection() throws SQLException
	{
		if(resultset != null) {
			resultset.close();
		}
		if(callablestatement != null) {
			callablestatement.close();
		}
		if(connection != null) {
			connection.close();
		}
	}

}
