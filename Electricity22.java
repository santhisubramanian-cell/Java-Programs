package ifelse;
import java.util.Scanner;
public class Electricity22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int unitsConsumed = scan.nextInt();
        scan.nextLine(); 
        String customerType = scan.nextLine();
        String season = scan.nextLine();
        String paymentMethod = scan.nextLine();
        double rate1 = 0, rate2 = 0, rate3 = 0, rate4 = 0;
        if (customerType.equals("Residential")) {
            rate1 = 0.10;
            rate2 = 0.15;
            rate3 = 0.25;
            rate4 = 0.30;
        } else if (customerType.equals("Commercial")) {
            rate1 = 0.12;
            rate2 = 0.18;
            rate3 = 0.25;
            rate4 = 0.25;
        } else { 
            rate1 = 0.08;
            rate2 = 0.12;
            rate3 = 0.20;
            rate4 = 0.20;
        }
        double tier1Cost = 0, tier2Cost = 0, tier3Cost = 0, tier4Cost = 0;

        if (unitsConsumed > 0) {
            int tier1Units = Math.min(unitsConsumed, 100);
            tier1Cost = tier1Units * rate1;
        }

        if (unitsConsumed > 100) {
            int tier2Units = Math.min(unitsConsumed - 100, 200);
            tier2Cost = tier2Units * rate2;
        }

        if (unitsConsumed > 300) {
            int tier3Units = Math.min(unitsConsumed - 300, 200);
            tier3Cost = tier3Units * rate3;
        }

        if (unitsConsumed > 500) {
            int tier4Units = unitsConsumed - 500;
            tier4Cost = tier4Units * rate4;
        }

        double subtotal = tier1Cost + tier2Cost + tier3Cost + tier4Cost;
        int seasonalAdjustment;
        if (season.equals("Summer")) {
            seasonalAdjustment = 15;
        } else if (season.equals("Winter")) {
            seasonalAdjustment = -10;
        } else {
            seasonalAdjustment = 0;
        }

        double adjustedTotal = subtotal * (1 + seasonalAdjustment / 100.0);
        int paymentDiscount;
        if (paymentMethod.equals("Auto-Pay")) {
            paymentDiscount = 5;
        } else if (paymentMethod.equals("Online")) {
            paymentDiscount = 3;
        } else {
            paymentDiscount = 0;
        }

        double totalBill = adjustedTotal * (1 - paymentDiscount / 100.0);

        
        totalBill =(totalBill * 100.0) / 100.0;
        double averageRate = 0;
        if (unitsConsumed > 0) {
            averageRate = totalBill / unitsConsumed;
            averageRate = (averageRate * 100.0) / 100.0;
        }
        System.out.println("Units Consumed: " + unitsConsumed + " kWh");
        System.out.println("Customer Type: " + customerType);
        System.out.println("Season: " + season);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Tier 1 Cost (0-100): $" + tier1Cost);
        System.out.println("Tier 2 Cost (101-300): $" + tier2Cost);
        System.out.println("Tier 3 Cost (301-500): $" + tier3Cost);
        System.out.println("Tier 4 Cost (501+): $" + tier4Cost);
        System.out.println("Seasonal Adjustment: " + seasonalAdjustment + "%");
        System.out.println("Payment Discount: " + paymentDiscount + "%");
        System.out.println("Total Bill: $" + totalBill);
        System.out.println("Average Rate: $" + averageRate + "/kWh");

	}

}
