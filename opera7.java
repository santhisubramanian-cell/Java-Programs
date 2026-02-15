package operators;
import java.util.Scanner;
public class opera7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		int pre = scan.nextInt();
		if(value>999 || pre==1) {
			System.out.println("Free Shipping");
		}
		else {
			System.out.println("charge applied");
		}
	}

}
