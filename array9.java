package two_d_array;
import java.util.Scanner;
public class array9 {

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
		System.out.println("Elevation Map:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int max = a[0][0];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
		}
		int min = max;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
				}
			}
		}
		int range = max-min;
		System.out.println("Highest Point:"+max+"m");
		System.out.println("Lowest Point:"+min+"m");
		System.out.println("Elevation Range:"+range+"m");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
