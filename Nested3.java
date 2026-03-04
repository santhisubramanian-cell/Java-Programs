package nestedloop;
import java.util.Scanner;
public class Nested3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String c = scan.next();
		
		if(c.equals("Star")) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*"+" ");
				}
				System.out.println();
			}
			
		}
		else if(c.equals("Number")) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}

	}

}
