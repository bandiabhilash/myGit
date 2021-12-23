import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDataJdbc {

	public static void main(String[] args) {
		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			// Creating a connection
			String url = "jdbc:mysql://localhost:3306/movies?autoReconnect=true&useSSL=false";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);

			// Create a query
			String query = "update movie_details set movieRating=? where movieTest=?";

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Please enter the movie_id");

			int mid = Integer.parseInt(br.readLine());

			int movie_Id = mid;

			System.out.println("Please enter the updated movie_name:");

			String updatedmovieName = br.readLine();

			// Get the PreparedStatement Object and set the data
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(2, movie_Id);
			pstmt.setString(1, updatedmovieName);
			int rowsAffected = pstmt.executeUpdate();
			System.out.println("Number of rows affected : " + rowsAffected);
			// Close the connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}