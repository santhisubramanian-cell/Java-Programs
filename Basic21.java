package javaprograms;
import java.util.Scanner;
public class Basic21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maintenance = scan.nextInt();
		int parking = scan.nextInt();
		int hall = scan.nextInt();
		int security = scan.nextInt();
		int electricity = scan.nextInt();
		int cleaning = scan.nextInt();
		
		int a= maintenance+parking+hall-security-electricity-cleaning;
		System.out.println(a);
	}

}

