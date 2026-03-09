package two_d_array;
import java.util.Scanner;
public class array19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] a = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Original Image:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int m = n/2;
		int[][] a2 = new int[m][m];;
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				a2[i][j]=(a[2*i][2*j]+a[2*i+1][2*j]+a[2*i][2*j+1]+a[2*i+1][2*j+1])/4;
			}
		}
		
		System.out.println("Compressed Image:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
