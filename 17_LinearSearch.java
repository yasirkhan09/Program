public class Main {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50}, target = 30;
        int index = -1;
        for (int i = 0; i < a.length; i++) if (a[i] == target) { index = i; break; }
        System.out.println(index == -1 ? "Not Found" : "Found at index " + index);
    }
}
