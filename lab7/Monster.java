package lab9;

public class Monster {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String attack() {
		return "Attack called in Monster " + getName();
	}

}
