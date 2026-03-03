package whiledowhile;
import java.util.Scanner;
public class While17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int sum=0;
		int temp=n;
		
		int i=1;
		while(i<=n/2) {
			if(n%i==0) {
				sum+=i;
			}
			i++;
		}
		if(temp == sum) {
			System.out.println(temp+"is a perfect number");
		}
		else {
			System.out.println(temp+"is not a perfect number");
		}

	}

}
