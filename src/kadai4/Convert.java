package kadai4;

public class Convert {

    public static boolean verify(int value) {
        // 整数の検証
        return true;
    }

    public static boolean verify(double value) {
        // 浮動小数点数の検証
        return true;
    }

    public static boolean verify(String value) {
        // 文字列の検証
        return value != null && !value.isEmpty();
    }

    public static void reverse(int value) {
        StringBuilder sb = new StringBuilder(String.valueOf(value));
        System.out.println(sb.reverse());
    }

    public static void reverse(double value) {
        StringBuilder sb = new StringBuilder(String.valueOf(value));
        System.out.println(sb.reverse());
    }

    public static void reverse(String value) {
        StringBuilder sb = new StringBuilder(value);
        System.out.println(sb.reverse());
    }
}
