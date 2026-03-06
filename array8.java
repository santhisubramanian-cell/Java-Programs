package one_d_array;
import java.util.Scanner;
public class array8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int longest = a[0];
		int sum =0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
			if(a[i]>longest) {
				longest=a[i];
			}
		}
		double avg = (double)sum/(double)n;
		int count=0;
		for(int i=0;i<n;i++) {
			if(a[i]>60) {
				count++;
			}
		}
		int sum2=0;
		for(int i=0;i<n;i++) {
			if(a[i]<60) {
				sum2+=a[i];
			}
		}
		double total = ((double)sum2/(double)n)*100.0;
		System.out.println("Total Patients:"+n);
		System.out.println("Longest Wait Time:"+longest);
		System.out.printf("Average Wait Time:%.2f",avg);
		System.out.println();
		System.out.println("Patients Waiting >60 min:"+count);
		System.out.printf("Service Level:%.2f%%",total);
	}

}
