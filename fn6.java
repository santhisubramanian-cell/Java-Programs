package functions;
import java.util.Scanner;

public class fn6 {
	
	public static int reverse(int n) {
		int rev=0;
		while(n!=0) {
			int digit = n%10;
			rev = rev*10+digit;
			n/=10;
			
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int res = reverse(n);
		System.out.println(res);

	}

}
