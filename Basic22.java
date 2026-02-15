package javaprograms;
import java.util.Scanner;
public class Basic22 {

	public static void main(String[] args) {
		Scanner scan = new sacnner(System.in);
		int copies = scan.nextInt();
		int cost = scan.nextInt();
		int edit= scan.nextInt();
		int design = scan.nextInt();
		int commision = scan.nextInt();
		int market = scan.nextInt();
		int value = (copies*cost)+edit+design-commision-market;
		System.out.println(value);

	}

}
