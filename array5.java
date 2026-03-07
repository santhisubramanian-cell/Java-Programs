package two_d_array;
import java.util.Scanner;
public class array5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		
		int[][] a =  new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Temperature Grid:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int max = a[0][0];
		int index1 = -1;
		int index2=-1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
					index1=i;
					index2=j;
					
				}
			}
			
		}
		int index3=-1;
		int index4=-1;
		int min=max;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
					index3=i;
					index4=j;
				}
			}
			
		}
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum+=a[i][j];
			}
			
		}
		int n = row*col;
		double avg = (double)sum/(double)n;
		
		System.out.println("Maximum Temperature:"+max+"°C at position ("+index1+","+index2+")");
		System.out.println("Minimum Temperature:"+min+"°C at position ("+index3+","+index4+")");
		System.out.printf("Average Temperature:%.2f°C ",avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
