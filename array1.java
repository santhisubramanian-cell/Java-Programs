package one_d_array;
import java.util.Scanner;
public class array1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int s = scan.nextInt();
		double[] a = new double[s];
		for(int i=0;i<s;i++) {
			a[i]=scan.nextDouble();
		}
	    double sum=0;
		for(int i=0;i<s;i++) {
			sum+=a[i];
		}
		double avg = sum/(double)s;
		
		int count =0;
		for(int i=0;i<s;i++) {
			if(a[i]>avg) {
				count++;
			}
		}
		double percentage = (count/(double)s)*100.0;
		System.out.println("Total Employees:"+s);
		System.out.println("Average Salary:"+avg);
		System.out.println("Employees Above Average:"+count);
		System.out.printf("Percentage: %.2f%% ",percentage);
		
		
		

	}

}
