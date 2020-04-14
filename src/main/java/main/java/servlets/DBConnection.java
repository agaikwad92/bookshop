package main.java.servlets;

import java.sql.*;
import java.util.ResourceBundle;

import main.java.sql.*;

public class DBConnection {
	private static Connection con;
	
	private DBConnection(){};
	
	static {
		
		try {
			
			Class.forName(main.java.sql.IDatabase.DRIVER_NAME);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try {
			
			con = DriverManager.getConnection(main.java.sql.IDatabase.CONNECTION_STRING, main.java.sql.IDatabase.USER_NAME, main.java.sql.IDatabase.PASSWORD);
		
		}
		catch (SQLException e) {

			e.printStackTrace();
		
		}
		
		
	}//End of static block
	
	public static Connection getCon()
	{
		return con;
	}
}