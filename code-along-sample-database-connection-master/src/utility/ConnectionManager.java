package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = null;
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SYSTEM","Naveen123");
		
		if(con!=null) {
			return con;
		}
		else {
			return null;
		}
		
	}
	
}
