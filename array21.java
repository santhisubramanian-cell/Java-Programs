package one_d_array;
import java.util.Scanner;
public class array21 {

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
		double min=max;
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		double threshold = (80.0/100.0)*avg;
		int count=0;
		String index ="";
		for(int i=0;i<n;i++) {
			if(a[i]<threshold) {
				count++;
				index+=(i+1)+",";
			}
		}
		if(count==0) {
			index="";
		}
		System.out.println("Fleet Size:"+n);
		System.out.printf("Average Fuel Efficiency:%.2f",avg);
		System.out.println();
		System.out.printf("Most Efficient:",max);
		System.out.println();
		System.out.printf("Least Efficient:",min);
		System.out.println();
		System.out.println("Underperforming Vehicles:"+count);
		System.out.printf("Efficiency Threshold:",threshold);
		System.out.println();
		System.out.println("Maintenance Priority:["+index.trim()+"]");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
