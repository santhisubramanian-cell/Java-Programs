package one_d_array;
import java.util.Scanner;
public class array15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		double avg = (double)sum/(double)n;
		
		int max = a[0];
		
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		int min = max;
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		int count=0;
		for(int i=0;i<n;i++) {
			if(a[i]>300) {
				count++;
			}
		}
		double com = (double)(n-count)/n*100.0;
		System.out.println("Total Calls:"+n);
		System.out.printf("Average Handling Time:%.2f",avg);
		System.out.println();
		System.out.println("Shortest Call:"+min);
		System.out.println("Longest Call:"+max);
		System.out.println("Calls Exceeding Target (300s):"+count);
		System.out.printf("Target Compliance:%.2f%%",com);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
