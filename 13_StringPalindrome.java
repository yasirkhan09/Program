public class Main {
    public static void main(String[] args) {
        String text = "madam";
        String reverse = new StringBuilder(text).reverse().toString();
        System.out.println(text.equals(reverse) ? "Palindrome" : "Not Palindrome");
    }
}
