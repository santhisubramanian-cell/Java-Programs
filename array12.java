package one_d_array;
import java.util.Scanner;
public class array12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		double[] a = new double[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextDouble();
		}
		double limit = scan.nextDouble();
		
		double sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		double avg = sum/(double)n;
		double peak=0;
		int index=-1;
		for(int i=0;i<n;i++) {
			if(a[i]>peak) {
				peak=a[i];
				index=i+1;
			}
		}
		System.out.println("Hours Monitored:"+n);
		System.out.printf("Total Daily Consumption:%.2f",sum,"kwh");
		System.out.println();
		System.out.print("Peak Hour: Hour "+ index + " ");
		System.out.printf("(%.2f)kwh",peak);
		System.out.println();
		System.out.printf("Average Hourly:%.2f",avg);
		System.out.println();
		System.out.printf("Daily Limit:%.2f",limit,"kwh");
		System.out.println();
		if(sum>limit) {
			System.out.printf("Status:Exceeded by %.2f",sum-limit,"kwh");
		}
		else {
			System.out.println("Status:Within Limit");
		}
		
	}

}
