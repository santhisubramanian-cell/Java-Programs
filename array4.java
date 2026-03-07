package two_d_array;
import java.util.*;
public class array4 {

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
		System.out.println("Sales Data:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Product-wise Total Slaes:");
		int max=a[0][0];
		for(int i=0;i<row;i++) {
			int sum=0;
			
			for(int j=0;j<col;j++) {
				sum+=a[i][j];
			}
		
			System.out.printf("Product %d:%d\n",(i+1),sum);
			if(sum>max) {
				max=sum;
			}
			
			
		}
		
		System.out.println("Best-Selling Product: "+"with"+max+"units");
		
		

	}

}
