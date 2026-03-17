package practice;
import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int size = scan.nextInt();
		int[] a = new int[size];
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();	
			
		}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i] == a[j]) {
					System.out.print(a[i]+" ");
					
				}
			}
		}
		
	
	}

}
