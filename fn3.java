package functions;
import java.util.Scanner;
public class fn3 {
	public static int largest(int a,int b,int c) {
		if(a>b && a>c) {
			return a;
		}
		else if(b>a && b>c) {
			return b;
		}
		else {
			return c;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int res = largest(a,b,c);
		System.out.println(res);
	}

}
