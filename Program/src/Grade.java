import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a grade (A, B, C, D, E): ");
        char grade = sc.next().charAt(0);
        grade = Character.toUpperCase(grade);
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            case 'E':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}


