package javaprograms;
import java.util.Scanner;
public class Basic18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int registration = scan.nextInt();
		int sponsor = scan.nextInt();
		int stall = scan.nextInt();
		int stage = scan.nextInt();
		int celebrity = scan.nextInt();
		int marketing = scan.nextInt();
		int a = registration +sponsor+stall-stage-celebrity-marketing;
		System.out.println(a);
		
	}

}


