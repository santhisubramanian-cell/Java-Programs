package operators;
import java.util.Scanner;
public class opera10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int unit = scan.nextInt();
		int vol = scan.nextInt();
		if(unit>500 || vol ==1) {
			System.out.println("Alert");
		}
		else {
			System.out.println("Normal");
		}

	}

}
