
package com.app.labs;
import java.sql.*;
import sun.jdbc.odbc.*;


public class Lokesh {

	public static void main(String[] args)throws ClassNotFoundException,SQLException,InterruptedException 
	{
		// TODO Auto-generated method stub
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("driver Loaded Succcessfully");
		Driver d= new JdbcOdbcDriver();
		DriverManager.registerDriver(d);
		
		Connection con = DriverManager.getConnection("jdbc:odbc:loki","scott","tiger");
		System.out.println(d);
		System.out.println(con);
		Statement st=con.createStatement();
		
		//String ddl="create table Stud(id number,sname varchar2(10),smarks number)";
		//st.execute(ddl);
		//System.out.println("Table created Successfully");
		/*String s1="insert into Stud(id,sname,smarks)values(111,'LOkesh',2000)";
		String s2="insert into Stud(id,sname,smarks)values(222,'Kranthi',3000)";
		String s3="insert into Stud(id,sname,smarks)values(333,'Raju',4000)";
		st.executeUpdate(s1);
		st.executeUpdate(s2);
		st.executeUpdate(s3);*/
		
		
		String s4="select * from Stud";
		ResultSet set=st.executeQuery(s4);
		//ResultSetMetadata kk=set.getResultSetMetadata();
		while(set.next())
		{
			System.out.println(set.getInt(1) + "--------" + set.getString(2)+"--------" +set.getInt(3));
			Thread.sleep(1000);
		}
		Thread.sleep(30000);
		String s5="drop table Stud";
		st.execute(s5);
		System.out.println("table is sucessfully Dropped");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println("created connection to database successfully");
		//Statement st=con.createStatement();
		System.out.println(con);
		Statement st=con.createStatement();
		
		String s1="create table raju(eno number,ename varchar2(10),esal number )";
		st.execute(s1);
		System.out.println("table raju is created");
		
		System.out.println("data Insertion started");
		String s2="insert into raju(eno,ename,esal)values('222','raju','35')";
		String s3="insert into raju(eno,ename,esal)values('233','Lokesh','45')";
		
		String s4="insert into raju(eno,ename,esal)values('444','Subbu','55')";
		System.out.println("data Insertion completed");
	Thread p2= Thread.currentThread();
		Thread p1=new Thread();
		p1.setPriority(10);
		p1.sleep(1000);
		p1.join();
		
		System.out.println("data retreving started");
		
		String s6= "select * from raju";
		ResultSet set=st.executeQuery(s6);
		while(set.next())
		{
			System.out.println(set.getInt(1)+ "---------" + set.getString(2) + "----------" +set.getInt(3));
		//Thread.sleep(1000);
		}
		System.out.println("data Insertion complete");
		//Thread.sleep(30000);
		//String s5= "drop table raju";
		//st.execute(s5);
		System.out.println("table raju dropped succesfully");
		
		
		String s1="select  from emp";
		ResultSet set=st.executeQuery(s1);
		while(set.next())
		{
			System.out.println(set.getInt(1)+"---"+set.getString(2)+"---"+set.getString(3));
			
		}*/
		
		
		

	}

}
