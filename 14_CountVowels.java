public class Main {
    public static void main(String[] args) {
        String text = "programming".toLowerCase();
        int count = 0;
        for (char c : text.toCharArray()) if ("aeiou".indexOf(c) >= 0) count++;
        System.out.println("Vowels = " + count);
    }
}
