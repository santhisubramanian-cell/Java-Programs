package whiledowhile;
import java.util.Scanner;
public class While8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int original = n;
		int sum=0;
		while(n!=0) {
			int rem = n%10;
			sum+=rem;
			n/=10;
		}
		System.out.println("Number:"+original);
		System.out.println("Sum of digits:"+sum);

	}

}
