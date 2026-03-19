package practice;
import java.util.Scanner;
public class missingnumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int s = scan.nextInt();
		
		int[]  a = new int[s];
		for(int i=0;i<s;i++) {
			a[i]=scan.nextInt();
			
		}
		int n = s+1;
		int total = n*(n+1)/2;
		
		int sum=0;
		for(int i=0;i<s;i++) {
			sum+=a[i];
		}
		
		int missing = total - sum;
		System.out.println(missing);
		
		
		
	}

}
