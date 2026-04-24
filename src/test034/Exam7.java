package test034;

import java.util.ArrayList;
import java.util.List;

public class Exam7 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("田中太郎", 20));
		list.add(new Engineer("鈴木一郎", 25, "Java"));
		list.add(new Employee("佐藤花子", 30));
		
		for (Employee e : list) {
			e.introduce();
		}

	}
}
