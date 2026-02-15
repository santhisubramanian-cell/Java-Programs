package operators;
import java.util.Scanner;
public class opera1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int theory = scan.nextInt();
		int practical = scan.nextInt();
	    float sum = (theory+practical)/2;
		if(theory>=50 && practical>=50 && sum>=60) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
