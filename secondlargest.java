package practice;
import java.util.Scanner;
public class secondlargest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int[] a = new int[size];
		
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		
		int first = a[0];
		int second = a[0];
		
		for(int i=0;i<size;i++) {
			if(a[i]>first) {
				second=first;
				first=a[i];
			}
			
			else if(a[i]>second && a[i]<first) {
				second = a[i];
			}
		}
		System.out.println("second largest: "+second);
	}

}
