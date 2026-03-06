package one_d_array;
import java.util.Scanner;
public class array7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int threshold = scan.nextInt();
		int count=0;
		System.out.println("Production Lines:"+n);
		System.out.println("Acceptable Threshold:"+threshold);
		System.out.println("Lines Exceeding Threshold:[");
		for(int i=0;i<n;i++){
			if(a[i]>threshold) {
				count++;
				System.out.print(i+1);
				if(count ==0 || i!=n-1) {
					System.out.print("");
				}
			}
			
		}
		System.out.println("]");
		System.out.println("Lines Exceeding Threshold:"+count);
		double res = ((double)(n-count)/n)*100;
		System.out.println();
		System.out.printf("Compliance Rate:%.2f%%",res);
				

	}

}
