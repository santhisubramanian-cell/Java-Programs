package operators;
import java.util.Scanner;
public class opera8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int id = scan.nextInt();
		if(age>=18 && id == 1) {
			System.out.println("Allowed");
		}
		else {
			System.out.println("Denied");
		}

	}

}
