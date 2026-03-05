package nestedloop;
import java.util.Scanner;
public class Nested6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		int c = scan.nextInt();
		
		int[][] a1 = new int[r][c];
		int[][] a2 = new int[r][c];
		int[][] a3 = new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a1[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a2[i][j]=scan.nextInt();
			}
		}
		System.out.println("Matrix A:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix B:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a2[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a3[i][j]=a1[i][j]+a2[i][j];
			}
		}
		System.out.println("Sum (A+B):");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
