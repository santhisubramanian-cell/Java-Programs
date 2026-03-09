package two_d_array;
import java.util.Scanner;
public class array21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int r1 = scan.nextInt();
		int c1 = scan.nextInt();
		int r2 = scan.nextInt();
		int c2 = scan.nextInt();
		
		int[][] a1 = new int[r1][c1];
		int[][] a2 = new int[r2][c2];

		int[][] a3 = new int[r1][c2];
		
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				a1[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				a2[i][j]=scan.nextInt();
			}
		}
		System.out.println("Matrix A:");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println("Matrix B:");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(a2[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println("result matrix:");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				for(int k=0;k<c1;k++) {
					a3[i][j]+=a1[i][k]*a2[k][j];
				}
			}
		}
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(a3[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
