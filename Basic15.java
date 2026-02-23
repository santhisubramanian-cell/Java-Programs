package javaprograms;
import java.util.Scanner;
public class Basic15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rooms = scan.nextInt();
		int price = scan.nextInt();
		int service = scan.nextInt();
		int commision = scan.nextInt();
		int value = (rooms*price)+service-commision;
		System.out.println(value);
		

	}

}

