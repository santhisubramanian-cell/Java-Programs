package two_d_array;
import java.util.*;
public class array2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int row = scan.nextInt();
		int col = scan.nextInt();
		char[][] a = new char[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]='A';
			}
		}
		
		
		int book = scan.nextInt();
		
		for(int i=1;i<=book;i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			a[x][y]='B';
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int total = row*col;
		int ava = book-total;
		int rate = (book/total)*100;
		
		System.out.println("Total Seats:"+total);
		System.out.println("Booked Seats:"+book);
		System.out.println("Available Seats:"+ava);
		System.out.println("Occupancy Rate:"+rate+"%");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
