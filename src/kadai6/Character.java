package kadai6;

public abstract class Character {
	private String name;
	
	public Character() {
		name = "";
	}
	
	public Character(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void info();
	public void attack() {}
    public void heal() {}

}
