package jishu3;

public class PlayStation extends GameConsole{
	private String modelNum;
	
	public PlayStation() {
		super();
		setName("Unkown");
		setReleaseYear(0);
		setCompany("Unknown");
		setArchitecture("Unknown");
		setNetwork(false);
		modelNum = "Unknown";
	}
	
	public PlayStation(String name, int releaseYear, String Company, String architecture, boolean network, String variant) {
		super(name, releaseYear, Company, architecture, network);
		this.modelNum = variant;		
	}
	
	public void setVar(String var) {
		this.modelNum= var;
	}
	
	public String getVar () {
		return modelNum;
	}
	
	public void showInfoPS(PlayStation ps) {
		showInfo(ps);
		System.out.println("This model number of this "+getName()+" is "+getVar());
	}

}
