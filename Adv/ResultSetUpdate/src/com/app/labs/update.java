package com.app.labs;

import java.sql.*; 
class update 
{  public static void main(String[] args)throws Exception 
    {   
	System.out.println("java developer jdbc is started ");   
    Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
    Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); 
    System.out.println("***********retrive the data ****************"); 
    String str3="select * from lokesh";  
    ResultSet rs= st.executeQuery(str3);   
    rs.first();  
    rs.updateInt("lno",999);  
    rs.updateRow();  
  rs.last();   
  rs.updateInt("lno",888);  
  rs.updateRow();  
  rs.absolute(3);   
  rs.updateInt("lno",999);   
  rs.updateRow();  
  System.out.println("lokesh");
  } 
} 