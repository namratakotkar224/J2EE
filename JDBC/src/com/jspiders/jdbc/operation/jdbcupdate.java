package com.jspiders.jdbc.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcupdate {

	private static Connection connection;
	private static Statement statement;
	private static String query;

	public static void main(String[] args) throws ClassNotFoundException {

		try {
			connection = openConnection();
			statement = connection.createStatement();
			query = "INSERT INTO student VALUES(6,'rmesh','rmesh@gmail.com',28,30000)";
			int row = statement.executeUpdate(query);
			System.out.println(row + " row(s) affected.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static Connection openConnection() throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3", "root", "root");

	}

	private static void closeConnection() throws SQLException {

		if (statement != null) {
			statement.close();
		}
		if (connection != null) {
			connection.close();
		}

	}

}