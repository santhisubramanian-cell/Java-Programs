package nestedloop;
import java.util.Scanner;
public class nested20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		int c = scan.nextInt();
		
		int[][] matrix = new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				matrix[i][j]=scan.nextInt();
			}
		}
		System.out.println("Original Matrix ("+r+"x"+c+")");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transposed Matrix ("+r+"x"+c+")");
		for(int j=0;j<c;j++) {
			for(int i=0;i<r;i++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

	}

}
