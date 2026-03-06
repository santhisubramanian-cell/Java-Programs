package one_d_array;
import java.util.*;

public class array18 {
    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);

    	int n= scan.nextInt();
    	int[] sales = new int[n];
    	for(int i=0;i<n;i++) {
    		sales[i]=scan.nextInt();
    	}
        int totalProducts = sales.length;
        int totalUnits = 0;

        int bestSellerIndex = 0;
        int bestSellerUnits = sales[0];
        for (int i = 0; i < sales.length; i++) {
            totalUnits += sales[i];

            if (sales[i] > bestSellerUnits) {
                bestSellerUnits = sales[i];
                bestSellerIndex = i;
            }
        }

        double averageSales = (double) totalUnits / totalProducts;
        double threshold = averageSales * 0.5;

        int slowMovingCount = 0;
        ArrayList<Integer> clearance = new ArrayList<>();
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > threshold) {
                slowMovingCount++;
                clearance.add(i + 1); 
            }
        }
        System.out.println("Total Products: " + totalProducts);
        System.out.println("Total Units Sold: " + totalUnits);
        System.out.printf("Average Monthly Sales: %.2f\n", averageSales);
        System.out.println("Best Seller: Product " + (bestSellerIndex + 1) + " (" + bestSellerUnits + " units)");
        System.out.println("Slow-Moving Products: " + slowMovingCount);
        System.out.printf("Turnover Threshold: %.2f units\n", threshold);
        System.out.println("Clearance Candidates: " + clearance);
    }
}