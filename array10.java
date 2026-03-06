package one_d_array;
import java.util.Scanner;
public class array10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n= scan.nextInt();
		
		int[] a =new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
			sum+=a[i];
			
		}
		int max = a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		int min=max;
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
				
			}
		}
		double avg = (double)sum/(double)n;
		int slow =0;
		for(int i=0;i<n;i++) {
			if(a[i]>200) {
				slow++;
			}
		}
		double score = (((double)n-(double)slow)/(double)n)*100.0;
		System.out.println("Total Servers:"+n);
		System.out.println("Fastest Response:"+min);
		System.out.println("Slowest Response:"+max);
		System.out.printf("Average Response:%.2f",avg);
		System.out.println();
		System.out.println("Slow Servers (>200ms):"+slow);
		System.out.printf("Performance Score:%.2f%%",score);
		
		
		
		
		
		
		
		
		
		

	}

}
