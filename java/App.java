import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1 to 3");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("please enter the id,name,power,weapon");
			int Id = sc.nextInt();
			String name = sc.nextLine();
			String power = sc.nextLine();
			String weapon = sc.nextLine();
			SuperHeroDTO s1 = new SuperHeroDTO(Id, name, power, weapon);
			GetCommunicationDAO.insertQuery(s1);
			break;
		case 2:
			GetCommunicationDAO getCommunicationDAO = new GetCommunicationDAO();
			getCommunicationDAO.updateHero(new SuperHeroDTO());
			break;
		case 3:
			GetCommunicationDAO getCommunicationDAO1 = new GetCommunicationDAO();
			getCommunicationDAO1.deleteHero(new SuperHeroDTO());
			break;

		}
	}
}
