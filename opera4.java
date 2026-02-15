package operators;
import java.util.Scanner;
public class opera4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int limit = scan.nextInt();
		int amt = scan.nextInt();
		int card = scan.nextInt();
		if(amt<=limit && card==0) {
			System.out.println("Approved");
		}
		else {
			System.out.println("Declined");
		}
	}

}
