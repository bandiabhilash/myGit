import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class GetCommunicationDAO {

	static Connection con = GetConnection.getConnection();

	public static Boolean insertQuery(SuperHeroDTO hero) {
		String query = "Insert into heros values(?,?,?,?)";
		boolean a = false;

		try {
			PreparedStatement ptmt = con.prepareStatement(query);
			ptmt.setInt(1, hero.getId());
			ptmt.setString(2, hero.getName());
			ptmt.setString(3, hero.getPower());
			ptmt.setString(4, hero.getWeapon());
			int rows = ptmt.executeUpdate();
			if (rows > 0) {
				a = true;
				System.out.println("The  " + rows + "  are inserted");
			} else {
				System.out.println("the rows" + hero.getName() + "doesn't exist");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (a == true)
			return a;
		return a;

	}

	public static void updateHero(SuperHeroDTO superhero) {
		try {
			String query = "update heros set Hero_weapon?where Hero_id=?";
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the updated weapon name:");

			String updatedweaponName = scan.nextLine();
			System.out.println("Please enter the HeroId");
			int HeroId = Integer.parseInt(scan.nextLine());

			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, updatedweaponName);
			pstmt.setInt(2, HeroId);
			int rowsAffected = pstmt.executeUpdate();
			System.out.println("Number of rows Affected :" + rowsAffected);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deleteHero(SuperHeroDTO superhero) {
		try {
			String query = "delete from heros where Hero_id=?";
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the HeroId:");

			int hid = scan.nextInt();

			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, hid);
			int rowsAffected = pstmt.executeUpdate();
			System.out.println("Number of rows Affected :" + rowsAffected);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
