package com.app.labs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import java.io.InputStream;
import java.lang.*;


public class Scanner {

	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
	  PreparedStatement preparedStatement = connection.prepareStatement("insert into Student1(?,?,?)");
	Scanner scanner = new Scanner(System.in);
	
	
	}

}
