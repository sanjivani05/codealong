package businessLogic;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import model.Users;
import utility.ConnectionManager;

public class RegisterProcess {
	
	ConnectionManager cm = new ConnectionManager();
	Connection con;
	
	public void register(Users user) throws ClassNotFoundException, SQLException {
		
		con = cm.getConnection();
		
		Statement statement = con.createStatement();
		statement.executeUpdate("INSERT into userdetail VALUES ('"+user.getUsername()+"','"+user.getPassword()+"','"+user.getEmail()+"')");
		System.out.println("Sucessfully Inserted");
	}

}
