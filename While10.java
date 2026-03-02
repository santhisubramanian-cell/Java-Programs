package whiledowhile;
import java.util.Scanner;
public class While10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int a =0;
		int b=1;
		int i=0;
		int c = 0;
		while(i<n) {
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
			i++;
		}
	}

}
