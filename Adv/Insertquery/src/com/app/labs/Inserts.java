package com.app.labs;
import java.sql.*;
import java.util.*;
import java.lang.*;

public class Inserts {

	public static void main(String[] args)throws ClassNotFoundException,SQLException,Exception
	{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@BhargavKMupala:1521:XE","scott","tiger");
		con.createStatement();
		Statement st = con.createStatement();
		String s1="create table Student(sno number,sname varchar2(10),smark number)";
		boolean b=st.execute(s1);
		System.out.println(b);
		System.out.println("Table created Successfully");
		String s2="insert into Student(sno,sname,smark)values('222','raju','35')";
		String s3="insert into Student(sno,sname,smark)values('233','Lokesh','45')";
		
		String s4="insert into Student(sno,sname,smark)values('444','Subbu','55')";
		st.executeUpdate(s2);
		st.executeUpdate(s3);
		st.executeUpdate(s4);
		System.out.println("data Inserted suceessfully");
		String s5="select * from Student";
		ResultSet set=st.executeQuery(s5);
		while(set.next())   
		{
			
			System.out.println(set.getInt(1)+"---"+set.getString(2)+"---"+set.getInt(3));    
			Thread.sleep(1000);
		}   
		
		Thread.sleep(30000);
		String s6="drop table Student";
		st.execute(s6);
		System.out.println("Table is successfully dropped");
		
		
		
		
	}

}
