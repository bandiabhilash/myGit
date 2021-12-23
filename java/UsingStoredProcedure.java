
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class UsingStoredProcedure {
	Connection con;

	public static void main(String[] args) {
		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			// Creating a connection
			String url = "jdbc:mysql://localhost:3306/movies";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);

			// Issue the statement
			String query = "{call fetchmovie_details(?)}";
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the name of the movie_details you want to search for:");
			String movie_name = scan.nextLine();
			CallableStatement cstc = con.prepareCall(query);
			cstc.setString(1, movie_name);
			ResultSet rs = cstc.executeQuery();

			// Processing the result out of the db:
			while (rs.next()) {
				int mid = rs.getInt(1);
				String name = rs.getString("moviename");
				int movieyear = rs.getInt(2016);
				String movieRating = rs.getString("movieRating");
				String movieTest = rs.getString("movieTest");
				System.out.println(mid + " -------- " + name + " -------- " + movieyear + " -------- " + movieRating
						+ " -------- " + "-------- " + movieTest);

			}

			// Close the connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}