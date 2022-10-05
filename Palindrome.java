public class Palindrome {
    // метод, с которого начинается выполнение
    public static void main(String[] args) {
        boolean stringPalindrome = true;
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (!isPalindrome(args[i])) {
                stringPalindrome = false;
            }
        }
        System.out.println(stringPalindrome);
    }
    // Реверс строки
    public static String reverseString(String s) {
        String rever = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rever += s.charAt(i);
        }
        return rever;
    }
    // Сравнение исходной и реверсированной строк
    public static Boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}
