package two_d_array;
import java.util.Scanner;
public class array6 {

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
		System.out.println("Traffic Data:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Total Traffic Per Lane:");
		for(int i=0;i<row;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				sum+=a[i][j];
			}
			System.out.println("Lane "+(i+1)+":"+sum);
		}
		int max=a[0][0];
		int sum1=0;
		for(int j=0;j<col;j++) {
			for(int i=0;i<row;i++) {
				sum1+=a[j][i];
				if(sum1>max) {
					max=sum1;
				}
				
			}
			System.out.println("Busiest Hour: Hour"+(j+1)+"with"+max+"vehicles");
		}

	}

}
