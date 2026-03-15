package functions;
import java.util.Scanner;
public class fn11 {
	public static double avg(int[] a,int s) {
		int sum=0;
		for(int i=0;i<s;i++) {
			sum+=a[i];
		}
		double avg = (double)sum/s;
		
		return avg;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int s = scan.nextInt();
		
		int[] a = new int[s];
		
		for(int i=0;i<s;i++) {
			a[i]=scan.nextInt();
		}
		
		double res = avg(a,s);
		System.out.println( (int) res);		

	}

}
