package test034;

public class Engineer extends Employee{
	//フィールド
	private String skill;
	
	//コンストラクタ
	public Engineer() {
		super();
		skill = "Unknown";
	}
	
	public Engineer(String name, int age, String skill) {
		super(name, age);
		this.skill = skill;
	}
	
	//ゲッターセッター
	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	
	public void introduce() {
		System.out.println(getName()+"さんは"+getAge()+"歳です。");
		System.out.println(getSkill()+"エンジニアです。");
	}
	
	
}