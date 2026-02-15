package javaprograms;
import java.util.Scanner;
public class Basic13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int yield = scan.nextInt();
		int acres = scan.nextInt();
		int extra = scan.nextInt();
		int damage = scan.nextInt();
		int a =(yield*acres)+extra-damage;
		System.out.println(a);
		

	}

}
