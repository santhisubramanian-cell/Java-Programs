package one_d_array;
import java.util.Scanner;
public class array17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		double[] a = new double[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextDouble();
		}
		double sum=0;
		double max=a[0];
		for(int i=0;i<n;i++) {
			sum+=a[i];
			if(a[i]>max) {
				max=a[i];
			}
		}
		double avg = sum/(double)n;
		double min = max;
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		int count=0;
		String index = "";
		for(int i=0;i<n;i++) {
			if(a[i]>6.5 || a[i]<8.5) {
				count++;
				index+=(i+1)+",";
			}
		}
		double com = ((double)n-(double)count)/(double)n*100.0;
		
		System.out.println("Total Samples:"+n);
		System.out.printf("Average pH:%.2f",avg);
		System.out.println();
		System.out.printf("Minimum pH:%.2f",min);
		System.out.println();
		System.out.printf("Maximum pH:%.2f ",max);
		System.out.println();
		System.out.println("Unsafe Samples: "+count);
		System.out.printf("Safety Compliance:%.2f%%",com);
		System.out.println();
		System.out.println("Critical Alerts:["+index.trim()+"]");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
