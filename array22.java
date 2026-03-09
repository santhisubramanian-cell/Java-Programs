package two_d_array;
import java.util.Scanner;
public class array22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int[][] a = new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		
		int top=0,bottom=r-1,left=0,right=c-1;
		
        while(top<=bottom && left<=right) {
			for(int i=left ;i<=right;i++) {
				System.out.print(a[top][i]+" ");
				
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				System.out.print(a[i][right]+" ");
			}
			right--;
			if(top<=bottom) {
				for(int i=right;i>=left;i--) {
					System.out.print(a[bottom][i]+" ");
				}
				bottom--;
			}
			if(left<=right) {
				for(int i=bottom;i>=top;i--) {
					System.out.print(a[i][left]+" ");
				}
				left++;
			}
		}

	}

}
