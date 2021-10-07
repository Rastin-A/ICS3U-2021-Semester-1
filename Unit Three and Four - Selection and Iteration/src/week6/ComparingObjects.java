public class ComparingObjects {
    public static void main(String[] args) {
        // to compare sTRINGS (ANY OBJECT) we should use the equals method (.equals)

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";
        String str4 = str1;

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str1.equals(str4));
    }
}
