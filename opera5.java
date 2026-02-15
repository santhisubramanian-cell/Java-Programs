package operators;
import java.util.Scanner;
public class opera5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int salary = scan.nextInt();
		int score = scan.nextInt();
		if(salary>25000 && score>700) {
			System.out.println("Approved");
		}
		else {
			System.out.println("Declined");
		}

	}

}
