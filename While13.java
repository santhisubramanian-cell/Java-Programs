package whiledowhile;
import java.util.Scanner;
public class While13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int base = scan.nextInt();
		int expo = scan.nextInt();
		int i=1;
		int result = 1;
		while(i<=expo) {
			result*=base;
			i++;
		}
		System.out.println(base+"^"+expo+"="+result);
	}

}
