import java.util.Scanner;
public class DayOfWeek {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the number(1-7):");
		int day = sc.nextInt();
		switch (day) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
		    break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("saunday");
			break;
			default:
				System.out.println("please enter a number between 1 to 7");
		
		}

	}

}
