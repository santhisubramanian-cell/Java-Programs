package whiledowhile;
import java.util.Scanner;
public class While12 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int original = n;
		int rev = 0;
		
		while(n!=0) {
			int rem = n%10;
			rev = rev*10+rem;
			n/=10;
		}
		if(original == rev) {
			System.out.println(original+ "is a Palindrome");		
			
		}
		else {
			System.out.println(original+ "is not a Palindrome");
		}
	}

}
