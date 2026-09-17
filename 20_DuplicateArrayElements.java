import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] a = {10, 20, 10, 30, 20, 40};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for (int n : a) if (!seen.add(n)) duplicate.add(n);
        System.out.println("Duplicates = " + duplicate);
    }
}
