package JB40;

public class UserAction1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 田中太郎（20）の情報を登録して出力
		User tanaka = new User("田中太郎", 20);
		tanaka.showInfo();
		
		System.out.println("---");
		// 鈴木一郎（25）の情報を登録して出力
		User suzuki = new User("鈴木一郎", 25);
		suzuki.showInfo();
	}

}
