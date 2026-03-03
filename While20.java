package whiledowhile;
import java.util.Scanner;
public class While20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int temp=n;
		int sum=0;
		
		
		while(n!=0) {
			int rem = n%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		if(temp == sum) {
			System.out.println(temp+"is a Strong number");
		}
		else {
			System.out.println(temp+"is not a Strong number");
		}
	}

}
