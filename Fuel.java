package javaprograms;
import java.util.Scanner;
public class Fuel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int distance = scan.nextInt();
		int mileage = scan.nextInt();
		int fuelPrice = scan.nextInt();
		int toll = scan.nextInt();
		int a = distance/mileage;
		int b= a*fuelPrice;
		int c = b+toll;
		System.out.println("Total Trip Cost ="+c);

	}

}
