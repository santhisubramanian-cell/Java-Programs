package ifelse;
import java.util.Scanner;
public class Movie19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String movieFormat = scan.nextLine();
		String showTime = scan.nextLine();
		String seatCategory = scan.nextLine();
		String customerType = scan.nextLine();
		
		double basePrice=12.0;
		double formatSurcharge =0;
		
		if(movieFormat.equals("2D")) {
			formatSurcharge=0.0;
		}
		else if(movieFormat.equals("3D")) {
			formatSurcharge=5.0;
		}
		else if(movieFormat.equals("IMAX")) {
			formatSurcharge=8.0;
		}
		else if(movieFormat.equals("4Dx")) {
			formatSurcharge=10.0;
		}
		
		double seatUpgrade =0;
		if(seatCategory.equals("Standard")) {
			seatUpgrade=0.0;
		}
		else if(seatCategory.equals("Premium")) {
			seatUpgrade=4.0;
		}
		else if(seatCategory.equals("Recliner")) {
			seatUpgrade=7.0;
		}
		
        int timeAdjustment;
        if (showTime.equals("Matinee")) {
            timeAdjustment = -30;
        } else if (showTime.equals("Evening")) {
            timeAdjustment = 0;
        } else if (showTime.equals("Prime-Time")) {
            timeAdjustment = 20;
        } else { 
            timeAdjustment = -20;
        }
        int customerDiscount;
        if (customerType.equals("Adult")) {
            customerDiscount = 0;
        } else if (customerType.equals("Senior")) {
            customerDiscount = 25;
        } else if (customerType.equals("Student")) {
            customerDiscount = 15;
        } else { 
            customerDiscount = 30;
        }
        double baseWithSurcharges = basePrice + formatSurcharge + seatUpgrade;
        double adjustedPrice = baseWithSurcharges * (1 + timeAdjustment / 100.0);
        double finalPrice = adjustedPrice * (1 - customerDiscount / 100.0);     
        finalPrice =(finalPrice * 100.0) / 100.0;
        String concessionVoucher;
        if (showTime.equals("Matinee") || 
            customerType.equals("Senior") || 
            customerType.equals("Student") || 
            customerType.equals("Child")) {
            concessionVoucher = "Yes";
        } else {
            concessionVoucher = "No";
        }
        String pricingCategory;
        if (finalPrice < 10) {
            pricingCategory = "Value";
        } else if (finalPrice < 20) {
            pricingCategory = "Standard";
        } else if (finalPrice < 30) {
            pricingCategory = "Premium";
        } else {
            pricingCategory = "Luxury";
        }
        System.out.println("Movie Format: " + movieFormat);
        System.out.println("Show Time: " + showTime);
        System.out.println("Seat Category: " + seatCategory);
        System.out.println("Customer Type: " + customerType);
        System.out.println("Base Ticket Price: $" + basePrice);
        System.out.println("Format Surcharge: $" + formatSurcharge);
        System.out.println("Seat Upgrade Fee: $" + seatUpgrade);
        System.out.println("Time-Based Adjustment: " + timeAdjustment + "%");
        System.out.println("Customer Discount: " + customerDiscount + "%");
        System.out.println("Final Ticket Price: $" + finalPrice);
        System.out.println("Concession Voucher: " + concessionVoucher);
        System.out.println("Pricing Category: " + pricingCategory);


	}

}
