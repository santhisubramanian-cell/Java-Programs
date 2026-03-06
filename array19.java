package one_d_array;
import java.util.Scanner;
public class array19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = new int[n];
		int sum =0;
		
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
			sum+=a[i];
		}
		double avg = (double)sum/(double)n;
		
		int max = a[0];
		int index=-1;
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
				index=i+1;
			}
		}
		int count =0;
		for(int i=0;i<n;i++) {
			if(a[i]<avg) {
				count++;
			}
		}
		double goal = ((double)n-(double)count)/(double)n*100.0;
		
		System.out.println("Days Tracked: "+n);
		System.out.println("Total Calories Burned: "+sum);
		System.out.printf("Average Daily Burn:%.2f ",avg);
		System.out.print("Peak Burn Day:Day "+index);
		System.out.println("("+max+")");
		System.out.println("Days Below Target: "+count);
		System.out.printf("Goal Achievement: %.2f%% ",goal);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
