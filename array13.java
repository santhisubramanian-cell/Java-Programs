package one_d_array;
import java.util.Scanner;
public class array13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int sum=0;
		int max=a[0];
		for(int i=0;i<n;i++) {
			sum+=a[i];
			if(a[i]>max) {
				max=a[i];
			}
		}
		double avg = (double)sum/(double)n;
		int ontime=0;
		for(int i=0;i<n;i++) {
			if(a[i]<=15) {
				ontime++;
			}
		}
		int compensation =0;
		for(int i=0;i<n;i++) {
			if(a[i]>180) {
				compensation++;
			}
		}
		double performance = ((double)ontime/(double)n)*100.0;
		
		System.out.println("Total Flights:"+n);
		System.out.printf("Average Delay:%.2f",avg);
		System.out.println();
		System.out.println("Maximum Delay:"+max);
		System.out.println("On-Time Flights:"+ontime);
		System.out.println("Compensation Required:"+compensation);
		System.out.printf("On-Time Performance:%.2f%%",performance);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
