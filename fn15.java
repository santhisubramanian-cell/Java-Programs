package functions;
import java.util.Scanner;
public class fn15 {
	
	public static void isperfect(int n) {
		int sum =0;
		int original = n;
		
		for(int i=1;i<=n/2;i++) {
			if(n%i == 0) {
				sum+=i;
			}
		}
		if(original == sum) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("Not perfect number");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		isperfect(n);

	}

}
