public class Main {
    public static void main(String[] args) {
        int[] a = {10, 45, 23, 67, 12};
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : a) { if (n > largest) { second = largest; largest = n; } else if (n > second && n != largest) second = n; }
        System.out.println("Second Largest = " + second);
    }
}
