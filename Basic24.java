package javaprograms;
import java.util.Scanner;
public class Basic24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int registration = scan.nextInt();
		int broad = scan.nextInt();
		int sponsor = scan.nextInt();
		int prize = scan.nextInt();
		int rent = scan.nextInt();
		int ad = scan.nextInt();
		int value = registration+broad+sponsor-prize-rent-ad;
		System.out.println(value);
	}

}
