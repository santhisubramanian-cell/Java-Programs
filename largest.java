package practice;
import java.util.Scanner;
public class largest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		int[] a = new int[size];
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		int max = a[0];
		
		
		for(int i=0;i<size;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("largest element in an array is: "+max);

	}

}
