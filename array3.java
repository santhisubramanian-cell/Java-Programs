package two_d_array;
import java.util.*;
public class array3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		int[][] a1 = new int[row][col];
		int[][] a2 = new int[row][col];
		int[][] a3 = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a1[i][j]=scan.nextInt();
			}
		}
		System.out.println("Matrix 1:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a2[i][j]=scan.nextInt();
			}
		}
		System.out.println("Matrix 2:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a2[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a3[i][j]=a1[i][j]+a2[i][j];
			}
		}
		System.out.println("sum matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a3[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
