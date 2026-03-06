package one_d_array;
import java.util.ArrayList;
import java.util.Scanner;
public class array6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		double[] a = new double[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextDouble();
		}
		double sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		String res="";
		double avg = sum/(double)n;
		int count=0;
		double threshold = avg*2;
		ArrayList<Integer> index = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(a[i]>threshold) {
				count++;
				index.add(i);
			}
		}
		System.out.println("Total Transactions:"+n);
		System.out.printf("Average Transaction:$%.2f",avg);
		System.out.println();
		System.out.println("Suspicious Transactions:"+count);
		System.out.println("Fraud Alert Indices:"+index);

	}

}
