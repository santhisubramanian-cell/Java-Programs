package nestedloop;
import java.util.Scanner;
public class Nested13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int[][] a = new int[size][size];
		int top=0,bottom=size-1,left=0,right=size-1,num=1;
		
        while(top<=bottom && left<=right) {
			for(int i=left ;i<=right;i++) {
				a[top][i]=num++;
				
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				a[i][right]=num++;
			}
			right--;
			if(top<=bottom) {
				for(int i=right;i>=left;i--) {
					a[bottom][i]=num++;
				}
				bottom--;
			}
			if(left<=right) {
				for(int i=bottom;i>=top;i--) {
					a[i][left]=num++;
				}
				left++;
			}
		}
		System.out.println("Spiral Matrix:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
