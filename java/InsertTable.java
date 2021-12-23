import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTable {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String dburl = "jdbc:mysql://localhost:3306/movies";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(dburl, username, password);

			String query = "insert into movie_details (movie_name,movie_year)values('Banana','2014')";
			Statement stmt = con.createStatement();
//			(movie_id int primary key auto_increment,movie_name varchar(10),movie_year varchar(5))";
			int a = stmt.executeUpdate(query);
			System.out.println("number of rows affected");
			if (a >= 0) {
				System.out.println("table created");
			} else {
				System.out.println("table not created");
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
