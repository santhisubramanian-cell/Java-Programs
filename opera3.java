package operators;
import java.util.Scanner;
public class opera3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hours = scan.nextInt();
		int attend = scan.nextInt();
		if(hours>40 && attend>90) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}

	}

}
