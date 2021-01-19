package com.springaujava.afternoon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;





public class javaafternoon {
	public interface test{
		int x=0;
		
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		
		
		try{
	           FileWriter fout=new  FileWriter("myfile.txt");
	          
	     		 for (int i = 1; i <= 10 ; i++)
	     	       {
	     	        int Random = (int)(Math.random()*100);
	     	       fout.write(Random + "\t"+ "");
	     	        if(Random%5==0)
	     	        {
	     	        	break;
	     	        }
	     	       }
	            
	        

	       
	           fout.close();
	           System.out.println("success...");
	       }catch(Exception e){System.out.println(e);
		}
			ArrayList<Integer>re=new ArrayList<Integer>();
		 FileReader fr;
		try {
			fr = new FileReader("myfile.txt");
			int i;
			String st="";
			
		    while ((i=fr.read()) != -1) {
		    	char d=(char)i;
		    	if(d=='\t')
		    	{
		    		int x=Integer.parseInt(st);
		    		re.add(x);
		    		 st="";
		    	}
		    	else
		    	{
		    			st=st+d;		
		    	}
		    }
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			  
		
		int number=re.stream().
		filter(e->e%5==0).reduce(0,(arr,i)->i);
		
		int id=number*2;
		String name="Shubham Kumar";
		
		Class.forName("com.mysql.jdbc.Driver"); 
		String url = "jdbc:mysql://remotemysql.com:3306/sMkXvyYxZM";
		String username = "sMkXvyYxZM";
		String	passowrd = "8h9tWhCKws";
		Connection connection = DriverManager.getConnection(url, username, passowrd);
		PreparedStatement stmt=connection.prepareStatement("insert into test values (?,?)");  
		stmt.setInt(1,id); 
		stmt.setString(2,name);  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
		  
		connection.close();  
		
		

	}

}
