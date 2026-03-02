package whiledowhile;
import java.util.Scanner;
public class While9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		boolean isprime = true;
		if(n<=1) {
			System.out.println(n+"is not prime");
		}
		int i=2;
		while(i<n/2) {
			if(n%i==0) {
				isprime=false;
				break;
			}
			i++;
		}
		if(isprime) {
			System.out.println(n+ "is prime");
		}
		else {
			System.out.println(n+ "is not prime");
		}

	}

}
