package p21;

public class Kose implements Japan {
	
	@Override
	public void work() {
		System.out.println("仕事はプログラマーです。");
	}
	
	@Override
	public void education() {
		System.out.println("大卒です");
	}
	
	@Override
	public void tax() {
		System.out.println("納税枠は60万円です。");
	}
}