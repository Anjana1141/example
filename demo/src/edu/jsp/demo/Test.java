package edu.jsp.demo;

import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Test {
	public static void main(String[] args) throws SQLException {
		Driver driver = new Driver();
		System.out.println("driver");
	}

}
