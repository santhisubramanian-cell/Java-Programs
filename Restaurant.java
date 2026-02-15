package javaprograms;
import java.util.Scanner;
public class Restaurant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalBill = scan.nextInt();
		int service = scan.nextInt();
		int gst = scan.nextInt();
		int people = scan.nextInt();
		int dis1 = totalBill*service/100;
		int dis2 = totalBill*gst/100;
		int amount = totalBill+dis1+dis2;
		float value = amount/people;
		System.out.println("Amount Per Person ="+value);
		
	}

}
