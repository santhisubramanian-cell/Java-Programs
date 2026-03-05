package nestedloop;
import java.util.Scanner;
public class Nested10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int product = scan.nextInt();
		int vendors = scan.nextInt();
		
		System.out.print("Product");
		for(int i=1;i<=vendors;i++) {
			System.out.print("Vendor"+i+" ");
		}
	    System.out.println();
		for(int i=0;i<product;i++) {
			String name = scan.next();
			System.out.printf("%-10s",name);
			
			double min = Double.MAX_VALUE;
			for(int j=0;j<vendors;j++) {
				double price = scan.nextDouble();
				System.out.printf("%-10.2f",price);
				min=Math.min(min, price);
			}
			System.out.printf("%-10.2f",min);
			System.out.println();
		}
		
		
	}

}
