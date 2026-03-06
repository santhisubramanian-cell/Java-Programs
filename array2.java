package one_d_array;
import java.util.Scanner;
public class array2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int threshold = scan.nextInt();
		
		int[] a = new int[n];
		int count=0;
		
		String index="";
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]<threshold) {
				if(count>0) {
					index+=",";
				}
				index+=i;
				count++;
				
			}
		}
		System.out.println("Total Products:"+n);
		System.out.println("Minimum Threshold:"+threshold);
		System.out.println("Low Stock Products:"+count);
		System.out.println("Product Indices:["+index+"]");
		
		
		
	}

}
