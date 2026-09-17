public class Main {
    public static void main(String[] args) {
        int[] a = {10, 45, 23, 67, 12};
        int max = a[0];
        for (int n : a) if (n > max) max = n;
        System.out.println("Maximum = " + max);
    }
}
