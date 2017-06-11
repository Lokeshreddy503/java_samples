package com.applabs;

import java.sql.DriverManager;
import java.sql.*;

public class RetrevingfromType1 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException, InterruptedException
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:oci:@192.168.1.169:1521:xe","scott","tiger");
	     System.out.println(con);
	     Statement st=con.createStatement();
	     String s1= "select * from Stud";
	     ResultSet set=st.executeQuery(s1);
	     ResultSetMetaData ms=set.getMetaData();
	     int a=ms.getColumnCount();
	     System.out.println(a);
	     for(int i=1;i<=a;i++)
	     {
	    	 String k=ms.getColumnName(i);
	    	 String p=ms.getColumnTypeName(i);
	    	
	    	 System.out.println("colmoun number"+i+"column name"+k+"column type"+p);
	     }
	     //String p=ms.getColumnTypeName(i);
	     
	     while(set.next())
	     {
	    	 System.out.println(set.getInt(1));
	    	 System.out.println(set.getString(2));

	    	 System.out.println(set.getInt(3));
	    	 Thread.sleep(1000);

	    	 
	     }
	     
	}

}
