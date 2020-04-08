package businessLogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utility.ConnectionManager;

public class LoginValidation {
	
	ConnectionManager cm = new ConnectionManager();
	Connection con;

	public void checkLogin(String username, String password) throws ClassNotFoundException, SQLException {
		
		con = cm.getConnection();
		Statement statement = con.createStatement();
		
		ResultSet resultset = statement.executeQuery("select username,password from userdetail");
		
		while(resultset.next()) {
			if(resultset.getString("username").equals(username)) {
				
				if(resultset.getString("password").equals(password)) {
					System.out.println("Login SUccess");
				}
				else {
					System.out.println("Invalid Password");
				}
				
			}
			else {
				System.out.println("Invalid User");
			}
			
		}
		
	}
}
