package forloop;
import java.util.Scanner;

public class for3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine(); 
        
        String status = "";
        double reorder = 0;
        int totalreorder = 0;
        int lowcount = 0;
        int criticalcount = 0;

        for (int i = 1; i <= n; i++) {
            String productname = scan.nextLine(); 
            
            int currentstock = scan.nextInt(); 
            int minstock = scan.nextInt(); 
            scan.nextLine(); 

            if (currentstock >= minstock) {
                status = "Adequate";
            } else if (currentstock < minstock && currentstock >= minstock / 2) {
                status = "Low Stock";
            } else if (currentstock < minstock / 2) {
                status = "Critical";
            }

            if (status.equals("Adequate")) {
                reorder = 0;
            } else if (status.equals("Low Stock")) {
                reorder = (minstock - currentstock) + minstock / 2;
                lowcount++;
                totalreorder++;
            } else if (status.equals("Critical")) {
                reorder = (minstock - currentstock) + minstock * 1.5;
                criticalcount++;
            }
            
            System.out.println("product: " + productname);
            System.out.println("current stock: " + currentstock);
            System.out.println("min stock: " + minstock);
            System.out.println("status: " + status);
            System.out.println("reorder: " + (int)reorder);
        }
        totalreorder+=reorder;
        System.out.println("total products: " + n);
        System.out.println("low items: " + lowcount);
        System.out.println("critical items: " + criticalcount);
        System.out.println("total reorder amount: " + totalreorder);
    }
}
