package nestedloop;
import java.util.Scanner;
public class Nested2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int row = scan.nextInt();
		int seat = scan.nextInt();
		
		for(int i=1;i<=row;i++) {
			System.out.print("Row "+i+":"+" ");
			for(int j=1;j<=seat;j++) {
				System.out.print("Seat-"+j+" ");
			}
			System.out.println();
			
		}
		System.out.println("Total seats:"+row*seat);
	}

}
