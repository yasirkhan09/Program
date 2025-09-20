import java.util.Scanner;
public class Color {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a color (Red, Yellow, Green): ");
        String color = sc.next();
        color = color.toLowerCase(); 
        switch (color) 
        {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Wrong color");
        }
    }
}

