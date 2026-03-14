package functions;
import java.util.Scanner;
public class fn9 {
	public static void fibonacci(int n) {
		int a =1;
		int b=1;
		System.out.print(a + " " + b + " ");
		
		for(int i=2;i<=n;i++) {
			int c = a+b;
			System.out.print(c +" ");
			a=b;
			b=c;
			
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		fibonacci(n);

	}

}
