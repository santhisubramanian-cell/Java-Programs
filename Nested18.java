package nestedloop;
import java.util.Scanner;
public class Nested18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		int rows = scan.nextInt();
		int col = scan.nextInt();
		int total=0;
		int ocuuspots = scan.nextInt();
		double rate=0;
		boolean[][] a = new boolean[rows][col];
		int vacant=0;
		for(int i=0;i<ocuuspots;i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			a[x][y]=true;
			
		}
		System.out.println("Parking Lot Grid:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				if(a[i][j]){
					System.out.print("[O]"+" ");
				}
				else {
					System.out.print("[ ]"+" ");
				}
			}
			System.out.println();
		}
		total = rows*col;
		vacant = total-ocuuspots;
		rate = ((double)ocuuspots/(double)total)*100.0;
		
		
		System.out.println("Total spots:"+total);
		System.out.println("occupancy:"+ocuuspots);
		System.out.println("vacancy:"+vacant);
		System.out.printf("Rate: %.2f%%",rate);
		
	}

}
