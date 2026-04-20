package kadai3;

public class Person {
    private String name;
    private int age;

    // --- Constructors ---
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // --- Getters ---
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // --- Setters with validation ---
    public boolean setName(String name) {
        if (hasNameError(name)) {
            return true;
        }
        this.name = name;
        return false;
    }

    public boolean setAge(int age) {
        if (hasAgeError(age)) {
            return true;
        }
        this.age = age;
        return false;
    }

    // --- Instance method (not static) ---
    public void introduce() {
        System.out.println(name + "は" + age + "歳です。");
        System.out.println("10年後は" + (age + 10) + "歳です。");
    }

    // --- Validation methods ---
    public static boolean hasNameError(String name) {
        if (name.length() > 20) {
            System.out.println("名前は20文字以内で入力してください。");
            return true;
        }
        if (name.equals("admin")) {
            System.out.println("利用できない名前です。");
            return true;
        }
        if (name.contains("㌔")) {
            System.out.println("名前に禁止文字が含まれています。");
            return true;
        }
        return false;
    }

    public static boolean hasAgeError(int age) {
        if (age < 0 || age > 130) {
            System.out.println("年齢は0以上130以下で入力してください。");
            return true;
        }
        return false;
    }
}
