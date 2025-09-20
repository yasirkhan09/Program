import java.util.Scanner;
public class Marks {
	public static void main(String [] args)
	{
		Scanner sc =new Scanner (System.in);
		int hindi,english,math,urdu,chemistry;
		int total;
		double avg;
		System.out.print("Enter the mark hindi:");
		hindi=sc.nextInt();
		System.out.print("Enter the mark english:");
		english=sc.nextInt();
		System.out.print("Enter the mark math:");
		math=sc.nextInt();
		System.out.print("Enter the mark urdu:");
		urdu=sc.nextInt();
		System.out.print("Enter the mark chemistry:");
		chemistry=sc.nextInt();
		total=hindi+english+math+urdu+chemistry;
		avg=total/5.0;
		System.out.println("\ntotal ="+total);
		System.out.println("avg="+avg);
	}
}
