package nestedloop;
import java.util.Scanner;

public class Nested12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((i+j)%2==0) {
					System.out.print("■"+" ");
				}
				if((i+j)%2==1) {
					System.out.print("□"+" ");
				}
			}
			System.out.println();
		}

	}

}
