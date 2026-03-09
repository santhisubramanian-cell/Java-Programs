package two_d_array;
import java.util.Scanner;
public class array20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] a = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Matrix:");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		boolean found =true;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i][j]!=a[j][i]) {
					found = false;
					break;
				}
			}
		}
		
		if(found) {
			System.out.println("Status:Symmetric");
		}
		else {
			System.out.println("Status:Asymmetric");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
