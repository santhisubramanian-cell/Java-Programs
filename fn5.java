package functions;
import java.util.Scanner;
public class fn5 {
	
	public static boolean isPrime(int n) {
		boolean flag = true;
		if(n<=1) {
			return false;
		}
		else {
			for(int i=2;i<n/2;i++) {
				if(n%i==0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(isPrime(n)) {
			System.out.println(n+" is prime");
		}
		else {
			System.out.println(n+" is not prime");
		}
	}

}
