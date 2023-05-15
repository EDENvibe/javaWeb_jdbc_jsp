/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


package AccesBD;

/**
 *
 * @author PC
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Config.Configuration;
public class MonAcces {
        private String 	driver 	    =  null;			//Ex : "oracle.jdbc.OracleDriver"
	private String 	url 	    =  null; 		//Ex : "jdbc:oracle:thin:@192.168.200.91:1521:DATA10G";
	private String 	user 	    = null;
	private String 	password    = null;
	private Connection conn     = null;
	private ResultSet resultSet = null;
	
public MonAcces()
	{
		Configuration	config	=	new Configuration() ;
		this.driver 	= 	config.driver;
		this.url 	= 	config.url;
		this.user 	= 	config.user;
		this.password 	= 	config.password;
	}

// config
	public void loadDriver() 
	{
		try
		{
			//chargement Driver
			Class.forName(driver);
		}
		catch(ClassNotFoundException e)
		{
			System.err.println("Driver non trouvé");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public Connection getConnection()
	{
		if (conn == null)
		{
			try
			{
				//Connexion
				conn = DriverManager.getConnection(url, user, password);
			}
			catch(SQLException e)
			{
				System.err.println("Probleme de connexion  : "+ e.getMessage());
			}
		}
		else
		{
			try 
			{
				if (conn.isClosed())
					conn = DriverManager.getConnection(url, user, password);
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return conn;
	}
	
	public ResultSet executeSelect(String sql)
	{
		Statement statement;
		try {
			if (resultSet != null)
				resultSet.close();
			statement = getConnection().createStatement();
			resultSet = statement.executeQuery(sql);
			
			return resultSet ;
		} 
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void executeUpdate(String sql)
	{
		Statement statement;
		try {
			statement = getConnection().createStatement();
			statement.executeUpdate(sql);
		} 
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void closeConnection()
	{
		try 
		{
			if (resultSet != null)
				resultSet.close();
			if (conn != null)
				conn.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
   
}
