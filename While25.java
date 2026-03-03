package whiledowhile;
import java.util.Scanner;
public class While25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i=1;
		
		do {
			int j=1;
			do {
				System.out.print(i+" ");
				j++;
			}
			while(j<=i);
			System.out.println();
			i++;
		}
		while(i<=n);
		
	}

}
