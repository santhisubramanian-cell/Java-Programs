package two_d_array;
import java.util.Scanner;
public class array15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int row = scan.nextInt();
		int col = scan.nextInt();
		int[][] a = new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=scan.nextInt();
				
			}
		}
		
		System.out.println("Employee Contact Book:");
		for(int i=0;i<row;i++) {
			System.out.print("dept"+(i+1)+": ");
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int count=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(a[i][j]==0) {
					break;
				}
				else {
					count++;
				}
			}
		}
		System.out.println("Total Employees:"+count);

	}

}
