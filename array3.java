package one_d_array;
import java.util.Scanner;
public class array3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = new int[n];
		
		int max=a[0];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		int min =max;
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		int count=0;
		for(int i=0;i<n;i++) {
			if(a[i]<40) {
				count++;
			}
		}
		int total = n-count;
		double res = ((double)total/(double)n)*100.0;
		System.out.println("Total Students:"+n);
		System.out.println("Highest Score:"+max);
		System.out.println("Lowest Score:"+min);
		System.out.println("Failed Students: "+count);
		System.out.printf("Pass Percentage:%.2f%% ",res);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
