import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
	static Connection con;

	public static Connection getConnection() {
		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			// Creating a connection
			String url = "jdbc:mysql://localhost:3306/superhero";
			String username = "root";
			String password = "root";
			con = DriverManager.getConnection(url, username, password);
//			System.out.println("Connection is active");
//			con.close();
//			System.out.println("Connection is closed");
			return con;

//			if (con.isClosed()) {
//				System.out.println("Connection is closed");
//			} else {
//				System.out.println("Conncetion is active");
//			}
		} catch (Exception e) {
			e.printStackTrace();
			return con;
		}
	}

//	public static Connection getConnection() {
//		return con;
//	}

}
