
package com.app.database;
import java.sql.*;
import java.util.*;
import java.lang.*;
//import java.sun.jdbcOdbc.*;

public class JdbcBasic {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@BhargavKMupala:1521:XE","scott","tiger");
			//con.createStatement();
			//System.out.println("higgjkhh............");
			Statement st=con.createStatement(); //statement object creation   
			Scanner br=new Scanner(System.in); //used to take input from keyboard 
			System.out.println("enter table name");    
			String tname=br.next();  
			st.execute("create table "+tname+"(eno number,ename varchar2(10),esal number)"); 
			//st.executeUpdate("insert into chiru(eno,ename,esal)values('111','Lokesh','500')");
			//System.out.println("table "+tname+" created successfully ");  
			//System.out.println(rowcount);      
			//System.out.println(st.executeQuery("select * from Raju"));
			//String s2="insert into "+tname+"(eno,ename,esal)"
			con.close(); //close the connection  }} 
		
			
		
		
		
		
		
		
		

    }
}
