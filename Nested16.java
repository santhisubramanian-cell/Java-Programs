package nestedloop;
import java.util.Scanner;
public class Nested16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int days = scan.nextInt();
		int periods = scan.nextInt();
		String[][] matrix = new String[days][periods];
		
		for(int i=0;i<days;i++) {
			for(int j=0;i<periods;j++) {
				matrix[i][j]=scan.next();
			}
			System.out.println();
		}
		System.out.println("Class Time Table:");
		for (int i=1;i<=periods;i++) {
			System.out.print("Period"+i+" ");
		}
		for(int i=0;i<days;i++) {
			for(int j=0;i<periods;j++) {
				System.out.print(matrix[i][j]);			}
		}
		System.out.println();
	}

}
