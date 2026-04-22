package p21;

public class Hirai implements Japan{
	
	@Override
	public void work() {
		System.out.println("仕事はシンガーです。");
	}
	
	@Override
	public void education() {
		System.out.println("博士です。");
	}
	
	@Override
	public void tax() {
		System.out.println("納税枠は500万円です。");
	}
}
