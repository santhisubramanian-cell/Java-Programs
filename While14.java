package whiledowhile;
import java.util.Scanner;
public class While14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int original = n;
		int count = (int) (Math.log10(n)+1);
		if(n==0) {
			count=0;
		}
		int sum =0;
		
		while(n!=0) {
			int rem = n%10;
			int res=1;
			for(int i=1;i<=count;i++) {
				res*=rem;
			}
			sum+=res;
			n/=10;
		}
		if(sum==original) {
			System.out.println(original+"is an Armstrong number");
		}
		else {
			System.out.println(original+"is not an Armstrong number");
		}

	}

	

}
