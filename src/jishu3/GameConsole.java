package jishu3;

public class GameConsole {
	private String name;
	private int releaseYear;
	private String company;
	private String architecture;
	private boolean network;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getArchitecture() {
		return architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}

	public boolean isNetwork() {
		return network;
	}

	public void setNetwork(boolean network) {
		this.network = network;
	}

	public GameConsole() {
		name = "Unknown";
		releaseYear = 0;
		company = "Unknown";
		architecture = "Unknown";
		network = false;
	}

	public GameConsole(String name, int releaseYear, String company, String architecture, boolean network) {
		this.name = name;
		this.releaseYear = releaseYear;
		this.company = company;
		this.architecture = architecture;
		this.network = network;
	}
	
	public void showInfo(GameConsole console) {
		console.getName();
		String networkStr = (isNetwork()) ? "has":"does not have";
		
		System.out.print("The console "+console.getName()+" was released on "+console.getReleaseYear()+" by "+console.getCompany()+".");
		System.out.println("It "+ networkStr + " network capabilities.");
	}

}
