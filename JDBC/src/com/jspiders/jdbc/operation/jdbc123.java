package com.jspiders.jdbc.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Scanner;
public class jdbc123 {
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your id");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter your name");
		String name=scanner.nextLine();
		System.out.println("enter your email");
		String email=scanner.nextLine();
		System.out.println("enter youe age");
		int age=scanner.nextInt();
		System.out.println("enter your fees");
		double fees=scanner.nextDouble();
		// TODO Auto-generated method stub
		try {
			connection =openConnection();
			statement=connection.createStatement();
			query="INSERT INTO student Values("+id+",'"+name+"','"+email+"',"+age+","+fees+")";//dynamic query
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




