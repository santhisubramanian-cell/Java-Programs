package nestedloop;
import java.util.Scanner;
public class Nested1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Multipilication Table ("+a+"x"+b+")");
		for(int i=1;i<=a;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=1;i<=a;i++) {
			System.out.print(i+" ");
			for(int j=1;j<=b;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}

	}

}
