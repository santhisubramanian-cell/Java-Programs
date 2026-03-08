package two_d_array;
import java.util.Scanner;
public class array7 {

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
		System.out.println("Inventory Grid:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum+=a[i][j];
			}
		}
		int n = row*col;
		double avg = (double)sum/(double)n;
		int max = a[0][0];
		int index=-1;
		int index1=-1;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
					index=i;
					index=j;
				}
			}
		}
		System.out.println("Total Inventory:"+sum);
		System.out.println("Max Stock Zone: Row "+index+","+"col"+index1+"("+max+"units)");
		System.out.printf("Average Stock per Zone:%.2f",avg);

	}

}
