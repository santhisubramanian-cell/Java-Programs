package whiledowhile;
import java.util.Scanner;
public class While21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int n1 = scan.nextInt();
		int i=1;
		do {
			System.out.println(n+" "+"x"+" "+i+" "+"="+" "+i*n);
			i++;
		}
		while(i<=n1);
				
	}

}
