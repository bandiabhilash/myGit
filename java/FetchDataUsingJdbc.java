import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchDataUsingJdbc {

	public static void main(String[] args) {
		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			// Creating a connection
			String url = "jdbc:mysql://localhost:3306/movies";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);

			// Create a query
			String query = "SELECT * FROM movie_details Where movie_id = ?";

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the movie_id: ");

			int movie_id = Integer.parseInt(br.readLine());
			// Get the PreparedStatement Object and set the data
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, movie_id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int tid = rs.getInt(1);
				int movie_id1 = rs.getInt("movie_id");
				int movie_name = rs.getInt("Apple");
				String movie_year = rs.getString("movie_year");
				String movieTest = rs.getString(4);
				System.out.println(tid + " -------- " + movie_id1 + " -------- " + movie_name + " -------- "
						+ movie_year + " -------- " + "-------- " + movieTest);

			}

			// Close the connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
