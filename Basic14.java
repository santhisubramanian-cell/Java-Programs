package javaprograms;
import java.util.Scanner;
public class Basic14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		int session = scan.nextInt();
		int pay = scan.nextInt();
		int bonus= scan.nextInt();
		int mainten= scan.nextInt();	
		int value = base+(session*pay)+bonus-mainten;
		System.out.println(value);

	}

}

