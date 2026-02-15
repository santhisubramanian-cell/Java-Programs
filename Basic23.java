package javaprograms;
import java.util.Scanner;
public class Basic23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int weight = scan.nextInt();
		int rate = scan.nextInt();
		int priority = scan.nextInt();
		int insu = scan.nextInt();
		int hand = scan.nextInt();
		int fuel = scan.nextInt();
		int value = (weight*rate)+priority+insu-hand-fuel;
		System.out.println(value);

	}

}
