package operators;
import java.util.Scanner;
public class opera9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int username = scan.nextInt();
		int password = scan.nextInt();
		int acc = scan.nextInt();
		if(username==1 && password == 1 && acc ==0) {
			System.out.println("Success");
		}
		else {
			System.out.println("Fail");
		}
	}

}
