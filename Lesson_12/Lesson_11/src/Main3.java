public class Main3 {

    public static int hashCode1(String s) {
        int result = 0;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            result += chars[i];
        }

        return result;
    }

    public static int hashCode2(String s) {
        char chars[] = s.toCharArray();
        int result = 0;

        for (int i = 0; i < chars.length; i++) {
            result = 31 * result + chars[i];
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "Hello";
        int hash1 = hashCode2(s);
        System.out.println(hash1);
        // 72, 101, 108, 108, 111
    }
}
