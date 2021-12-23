import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String dburl = "jdbc:mysql://localhost:3306/movies";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(dburl, username, password);

			String query = "CREATE TABLE  movie_details (course_id int primary key auto_increment,course_name varchar(10),course_price varchar(15))";
			Statement stmt = con.createStatement();
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
