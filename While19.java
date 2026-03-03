package whiledowhile;
import java.util.Scanner;
public class While19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int decimal = scan.nextInt();
		
		int binary=0;
		while(decimal>0) {
			int rem = decimal%2;
			decimal = decimal/2;
			binary = binary*10+rem;
		}
		System.out.print(binary);
	}

}
