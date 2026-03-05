package nestedloop;
import java.util.Scanner;
public class Nested17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b= scan.nextInt();
		
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				if(i==1 || i==a || j==1 || j==b) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
