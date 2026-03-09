package two_d_array;
import java.util.Scanner;
public class array14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] a = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Original Matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int temp = a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int temp = a[i][j];
				a[i][j]=a[i][n-1-j];
				a[i][n-1-j]=temp;
				
			}
			
		}
		System.out.println("Rotated Matrix (90 deg clockwise):");		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}		
		
		
		
		
		
		
		
				
	}

}
