package one_d_array;
import java.util.Scanner;
public class array11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		double[] a1 = new double[n];
		double[] a2 = new double[n];
		double[] a3 = new double[n];
		
		for(int i=0;i<n;i++) {
			a1[i]=scan.nextDouble();
		}
		for(int i=0;i<n;i++) {
			a2[i]=scan.nextDouble();
		}
		double sum=0;
		for(int i=0;i<n;i++) {
			a3[i]=a1[i]*a2[i];
			sum+=a3[i];
		}
		int maxindex =-1;
		double max = a3[0];
		for(int i=0;i<n;i++) {
			if(a3[i]>max) {
				max=a3[i];
				maxindex=i;
			}
		}
		int minindex=-1;
		double min=max;
		for(int i=0;i<n;i++) {
			if(a3[i]<min) {
				min=a3[i];
				minindex=i;
			}
		}
		System.out.println("Number of Assets:"+n);
		System.out.printf("Total Portfolio Value:%.2f",sum);
		System.out.println();
		System.out.printf("Most Valuable Asset:Asset %.2f",max,maxindex);
		System.out.println();
		System.out.printf("Least Valuable Asset:Asset %.2f",min,minindex);
		
		
	}

}
