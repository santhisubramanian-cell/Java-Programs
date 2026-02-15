package javaprograms;
import java.util.Scanner;
public class Factory {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rodsPerHour = scan.nextInt();
		int hoursWorked = scan.nextInt();
		int overtimeRods = scan.nextInt();
		int rejectedRods = scan.nextInt();
		int a = (rodsPerHour*hoursWorked)+overtimeRods-rejectedRods;
		System.out.println(a);
	}

}
