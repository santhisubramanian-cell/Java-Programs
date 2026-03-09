package two_d_array;
import java.util.Scanner;
public class array12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		int[][] a = new int[4][7];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<7;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Rainfall Data:");
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<7;j++) {
				int sum=0;
				if(a[i][j]==0) {
					System.out.print(a[i][j]+"0"+" ");
				}
				else {
					System.out.print(a[i][j]*10+" ");
				}
				
			}
			System.out.println();
		}
		for(int i=0;i<4;i++) {
			int sum=0;
			for(int j=0;j<7;j++) {
				sum+=a[i][j]*10;
				
			}
			System.out.println("Week"+(i+1)+":"+sum+"mm");
		}
		int sum=0;
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<7;j++) {
				sum+=a[i][j]*10;
				
			}
		}
		System.out.println("Monthly total:"+sum+"mm");
		
		
		
		
		
		
		

	}

}
