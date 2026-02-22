package javaprograms;
import java.util.Scanner;
public class Delivery {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int deliveries = scan.nextInt();
		int payout = scan.nextInt();
		int incentive = scan.nextInt();
		int fuelCost = scan.nextInt();
		int a = (deliveries*payout)+incentive-fuelCost;
		System.out.println(a);
		

	}

}

