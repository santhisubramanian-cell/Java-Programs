package one_d_array;
import java.util.Scanner;
public class array5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		double[] a = new double[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextDouble();
		}
		double max = a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		double min=max;
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		double diff =Math.abs(min-max);
		double save = (diff/max)*100.0;
		System.out.println("Number of Sellers:"+n);
		System.out.println();
		System.out.printf("Lowest Price:$ %.2f",min);
		System.out.println();
		System.out.printf("Highest Price::$ %.2f",max);
		System.out.println();
		System.out.printf("Price Difference:$ %.2f",diff);
		System.out.println();
		System.out.printf("Savings: %.2f",save);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
