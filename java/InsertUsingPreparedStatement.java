import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertUsingPreparedStatement {

	public static void main(String[] args) {
		try {
			// Load the driver
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			// Creating a connection
			String url = "jdbc:mysql://localhost:3306/movies";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);

			// Create a query
			String query = "insert into movie_details(movie_id,movie_name,movie_year) values(?,?,?)";
			System.out.println("Enter movie_id");
			String movie_id = sc.nextLine();
			System.out.println("Enter movie_name");
			String movie_name = sc.nextLine();
			System.out.println("Enter movie year");
			String movie_year = sc.nextLine();
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, movie_id);
			pstmt.setString(2, movie_name);
			pstmt.setString(3, movie_year);

			// Get the PreparedStatement Object and set the data
//			PreparedStatement pstmt = con.prepareStatement(query);
//			pstmt.setString(1, "Orange");
//			pstmt.setString(2, "2016");
//			pstmt.setString("Orange",2017);
//			pstmt.setString("Grapes",2018);

			int rowsAffected = pstmt.executeUpdate();
			System.out.println("Number of rows affected : " + rowsAffected);
			// Close the connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
