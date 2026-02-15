package operators;
import java.util.Scanner;
public class opera13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		int mask = scan.nextInt();
		if((value & mask)!=0) {
			System.out.println("Active");
		}
		else {
			System.out.println("Inactive");
		}
	}

}
