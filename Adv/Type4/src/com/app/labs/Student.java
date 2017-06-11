package com.app.labs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
		Statement statement = connection.createStatement();
		System.out.println(connection);
		
		
		/*String string = "create table Student1(sid number,sname varchar2(10),smarks number)";
		int a = statement.executeUpdate(string);
		System.out.println("table Student1 is created successfully");
		System.out.println("rous count" +a);
		Scanner scanner =  new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the student number");
			int sid = scanner.nextInt();
			System.out.println("Enter the Student name");
			String sname =  scanner.next();
			System.out.println("enter Student marks");
			int smarks = scanner.nextInt();
			String string2="insert into Student1(sid,sname,smarks)"
					+ "values('"+sid+"','"+sname+"','"+smarks+"')";
			int b = statement.executeUpdate(string2);
			System.out.println("the rows inserted:"+b);
			
			System.out.println("you want to insert another record(yes/no)");
			String string3 = scanner.next();
			if(string3.equals("no"))
			{
				break;
			}
			
		}
		connection.close();
		*/	
			
			
		}
		
		
		
}


