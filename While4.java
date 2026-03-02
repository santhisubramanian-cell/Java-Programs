package whiledowhile;
import java.util.Scanner;
public class While4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int fact = 1;
		int i=1;
		while(i<=n) {
			fact*=i;
			i++;
		}
		System.out.println("Factorial of "+ n +"="+ fact);
	}

}
