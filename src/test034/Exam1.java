package test034;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("名前: ");
		String name = sc.nextLine();
		System.out.println("年齢: ");
		int age = sc.nextInt();
		
		System.out.println(name+"さんの10年後は"+(age+10)+"歳です。");
	}

}
