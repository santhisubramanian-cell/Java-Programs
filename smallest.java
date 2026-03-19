package practice;
import java.util.Scanner;
public class smallest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		int[] a = new int[size];
		
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		int min = a[0];
		
		for(int i=0;i<size;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("smallest element:"+min);
	}

}
