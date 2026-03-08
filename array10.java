package two_d_array;
import java.util.Scanner;
public class array10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int row = scan.nextInt();
		int col = scan.nextInt();
		
		int[][] a = new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=scan.nextInt();			}
		}
		System.out.println("Sales Matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Representative Totals:");
		for(int i=0;i<row;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				sum+=a[i][j];
				
			}
			System.out.println("Rep "+(i+1)+": "+sum);
			
		}
		System.out.println("Territory Totals:");
		for(int i=0;i<col;i++) {
			int sum=0;
			for(int j=0;j<row;j++) {
				sum+=a[j][i];
			}
			System.out.println("Territory "+(i+1)+": "+sum);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
