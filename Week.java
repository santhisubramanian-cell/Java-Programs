package javaprograms;
import java.util.Scanner;
public class Week {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int daysWorked = scan.nextInt();
		int wagePerDay = scan.nextInt();
		int overtimeBonus = scan.nextInt();
		int charge = scan.nextInt();
		int a = daysWorked*wagePerDay;
		int b = a+overtimeBonus;
		int c = b-charge;
		System.out.println(c);

	}

}
