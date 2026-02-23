package javaprograms;
import java.util.Scanner;
public class Basic17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hours = scan.nextInt();
		int rate = scan.nextInt();
		int design = scan.nextInt();
		int testing = scan.nextInt();
		int advance= scan.nextInt();
		int a= (hours*rate)+design+testing-advance;
		System.out.println(a);
		

	}

}

