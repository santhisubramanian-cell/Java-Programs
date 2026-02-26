package javaprograms;
import java.util.Scanner;
public class Basic20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ads = scan.nextInt();
		int sponsor = scan.nextInt();
		int affiliate = scan.nextInt();
		int tax = scan.nextInt();
		int production = scan.nextInt();
		int value = ads+sponsor+affiliate-tax-production;
		System.out.println(value);
	}

}

