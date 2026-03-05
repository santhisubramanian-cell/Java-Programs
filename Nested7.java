package nestedloop;
import java.util.Scanner;
public class Nested7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int size = n/2;
		for(int i=0;i<=size;i++) {
			for(int j=0;j<=size-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=size-1;i>=0;i--) {
			for(int j=0;j<=size-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
