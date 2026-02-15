package operators;
import java.util.Scanner;
public class opera2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int balance = scan.nextInt();
		int withdrawal=scan.nextInt();
		int limit = scan.nextInt();
		if(withdrawal<=balance && withdrawal<=limit) {
			System.out.println("Approved");
		}
		else {
			System.out.println("Declined");
		}
	}

}
