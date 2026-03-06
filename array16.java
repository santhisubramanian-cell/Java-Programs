package one_d_array;
import java.util.Scanner;
public class array16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		int peakday=1;
		int avg = sum/n;
		int max=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
				peakday=i+1;
			}
		}
		double threshold =avg*1.5;
		int count =0;
		String num ="";
		for(int i=0;i<n;i++) {
			if(a[i]>threshold) {
				count++;
				num+=(i+1)+",";
			}
		}
		if(count==0) {
			num="";
		}
		System.out.println("Trading Days Analyzed:"+n);
		System.out.println("Total Volume:"+sum);
		System.out.println("Average Daily Volume:"+avg);
		System.out.print("Peak Volume Day: Day "+peakday+" ");
		System.out.println("("+ max +")");
		System.out.println("High Volume Days (>150% avg): "+count);
		System.out.println("Breakout Signal Days:["+num.trim()+"]");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
