package operators;
import java.util.Scanner;
public class opera6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int income = scan.nextInt();
		int mark = scan.nextInt();
		if(income<200000 && mark>=75) {
			System.out.println("Granted");
		}
		else {
			System.out.println("Not Granted");
		}

	}

}
