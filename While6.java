package whiledowhile;
import java.util.Scanner;
public class While6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int balance = scan.nextInt();
		
		do {
			System.out.println("Enter withdrawal amt:");
			int amt = scan.nextInt();
			if(balance<amt) {
				System.out.println("Insufficient funds! Try again ");
			}
			else {
				System.out.println("Withdrawal successfull! Remaining balance:"+(balance-amt));
				break;
			}
			
			
		}
		while(balance!=0);

	}

}
