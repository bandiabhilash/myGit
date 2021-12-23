public class SuperHeroDTO {

	private int Heroid;
	private String name;
	private String power;
	private String weapon;

	public SuperHeroDTO(int id, String name, String power, String weapon) {
		this.Heroid = id;
		this.name = name;
		this.power = power;
		this.weapon = weapon;
	}

	public int getId() {
		return Heroid;
	}

	public String getName() {
		return name;
	}

	public String getPower() {
		return power;
	}

	public String getWeapon() {
		return weapon;
	}

	@Override
	public String toString() {
		return "SuperHeroDTO [id=" + Heroid + ", name=" + name + ", power=" + power + ", weapon=" + weapon + "]";
	}

	public SuperHeroDTO() {

	}

}
