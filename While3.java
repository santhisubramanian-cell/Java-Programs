package whiledowhile;
import java.util.Scanner;
public class While3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int secretnumber = scan.nextInt();
		int attempt =0;
		
		while(true) {
			System.out.println("Guess the number(1100):");
			int userguess = scan.nextInt();
			attempt++;
			if(secretnumber<userguess) {
				System.out.println("Too high!");
			}
			else if(secretnumber>userguess) {
				System.out.println("Too low!");
			}
			else {
				System.out.println("Correct! Attemts:"+attempt);
				break;
			}
		}

	}

}
