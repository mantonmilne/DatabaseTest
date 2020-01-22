import java.sql.*; // for handling sql commands

// the driver needs to be in the referenced library. Properties\Java Build Path\add external jars, then see driver location in comment below.

public class Program {
	public static void main (String[] args) {
		
		//load the JDBC driver
		try {
			Class.forName("org.postgresql.Driver"); // actual path C:\\Program Files\\Java\\postgresql-42.2.9.jar	
		}
		catch (ClassNotFoundException e) {
			System.out.println("Could not load class " +"org.postgresql.Driver");
			e.printStackTrace();
			return;
		}
		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://yacata.dcs.gla.ac.uk:5432/","m_19_0005557m","0005557m"); //location, username, password
		} catch (SQLException e) {
			System.out.println("Connection Failed!");
		e.printStackTrace();
		return;
		}
		
		if (connection != null) {
		System.out.println("Controlling your database...");
		}else {
			System.out.println("Failed to establish connection");
		}
	}
}
// IP=jdbc:postgresql://yacata.dcs.gla.ac.uk:5432/
// Username = your-username
// Password = your-password